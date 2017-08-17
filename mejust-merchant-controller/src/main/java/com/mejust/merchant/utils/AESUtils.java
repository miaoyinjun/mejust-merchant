package com.mejust.merchant.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AESUtils {


    private static Logger LOGGER = LoggerFactory.getLogger(AESUtils.class);


    /**
     * 加密
     *
     * @param text
     * @param key
     * @return
     * @throws Exception
     */

    public static String encrypt(String text, String key)  {

        try{
            byte[] raw = key.getBytes();
            SecretKeySpec keySpec = new SecretKeySpec(raw, "AES");
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");//"算法/模式/补码方式"
//            IvParameterSpec iv = new IvParameterSpec(VI.getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度
//            cipher.init(Cipher.ENCRYPT_MODE, keySpec,iv);

            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
            cipher.init(Cipher.ENCRYPT_MODE,keySpec);

            byte[] encrypted = cipher.doFinal(text.getBytes("utf-8"));
//            String result = Base64.encode(encrypted);
            String result = parseByte2HexStr(encrypted);             //2进制 -> 16进制
            return result;
        }catch(Exception e){
            LOGGER.error("加密错误",e);
            return null;
        }
    }


    /**
     * 解密
     * @param text
     * @param key
     * @return
     * @throws Exception
     */

    public static String decrypt(String text, String key) {

        try {
            byte[] raw = key.getBytes();
            SecretKeySpec keySpec = new SecretKeySpec(raw, "AES");
            //======================CBC模式 Base64=====================================
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");//"算法/模式/补码方式"
//            IvParameterSpec iv = new IvParameterSpec(VI.getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度
//            cipher.init(Cipher.DECRYPT_MODE, keySpec,iv);
            //=======================ECB模式 十六进制===================================
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            //==========================================================================
            //  byte[] encrypted = Base64.decode(text);
            byte[] encrypted = parseHexStr2Byte(text);         //16进制 -> 2进制
            byte[] original = cipher.doFinal(encrypted);
            String result = new String(original, "utf-8");
            return result;
        } catch (Exception e) {
            LOGGER.error("解密错误",e);
            return null;
        }
    }


    /**
     * 将二进制转换成16进制
     *  @param buf
     *  @return
     *  */
    public static String parseByte2HexStr(byte[] buf) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**将16进制转换为二进制
     *  @param hexStr
     *  @return
     *  */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1){
            return null;
        }
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}