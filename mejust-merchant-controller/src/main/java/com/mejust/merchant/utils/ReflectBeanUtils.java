package com.mejust.merchant.utils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * 使用reflect进行转换
 * getDeclaredFields()会获取所有属性，需要过滤不需要的类型如 static final
 * 不会获取父类的属性，需要自己编码实现
 * 耗时与Introspector相比：1:100
 */
public class ReflectBeanUtils{

    public static Object mapToObject(Map<String, String> map, Class<?> beanClass) throws Exception {
        if (map == null || map.size()<=0)
            return null;

        Object obj = beanClass.newInstance();
        //获取关联的所有类，本类以及所有父类
        boolean ret = true;
        Class oo = obj.getClass();
        List<Class> clazzs = new ArrayList<Class>();
        while(ret){
            clazzs.add(oo);
            oo = oo.getSuperclass();
            if(oo == null || oo == Object.class)break;
        }

        for(int i=0;i<clazzs.size();i++){
            Field[] fields = clazzs.get(i).getDeclaredFields();
            for (Field field : fields) {
                int mod = field.getModifiers();
                if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                    continue;
                }
                //由字符串转换回对象对应的类型
                if (field != null) {
                    field.setAccessible(true);
                    field.set(obj, map.get(field.getName()));
                }
            }
        }
        return obj;
    }

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if(obj == null){
            return null;
        }
        //获取关联的所有类，本类以及所有父类
        boolean ret = true;
        Class oo = obj.getClass();
        List<Class> clazzs = new ArrayList<Class>();
        while(ret){
            clazzs.add(oo);
            oo = oo.getSuperclass();
            if(oo == null || oo == Object.class)break;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        for(int i=0;i<clazzs.size();i++){
            Field[] declaredFields = clazzs.get(i).getDeclaredFields();
            for (Field field : declaredFields) {
                int mod = field.getModifiers();
                //过滤 static 和 final 类型
                if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){
                    continue;
                }
                field.setAccessible(true);
                Object value = field.get(obj);
                if(value != null)
                    map.put(field.getName(), value);
            }
        }
        return map;
    }

    public static Map<String, String> reqParamsToMap(Map<String, String[]> requestParmas) {
        Map<String, String> params = new HashMap();
        for (String key: requestParmas.keySet()) {
            String value = null;
            String[] values = requestParmas.get(key);
            if(values != null && values.length>0) {
                value = values[0];
            }
            params.put(key, value);
        }
        return params;
    }


    public  static Map<String, String> parameterMapToMap(Map requestParams) {
        Map<String, String> params = new HashMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
            params.put(name, valueStr);
        }
        return params;
    }
}