package com.mejust.merchant.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * feign 异常配置处理
 * @author wangmingsen
 * @create 2017-08-02-9:58 AM
 **/

@Configuration
public class BizExceptionFeignErrorDecoder implements ErrorDecoder {
    Logger logger = LoggerFactory.getLogger(BizExceptionFeignErrorDecoder.class);
    private final ErrorDecoder delegate = new ErrorDecoder.Default();
    @Override
    public Exception decode(String methodKey, Response response) {
        logger.error("Call feign method '" + methodKey+"' has a error ." );
        Exception msException = null;
        try {
            if (response.status() >= 500) {
                return delegate.decode(methodKey, response);
            }
            byte[] bs = readStream( response.body().asInputStream());
            String responseTemp = new String(bs,"utf-8");

            ObjectMapper mapper = new ObjectMapper();
           // msException  = mapper.readValue(responseTemp, SystemErrorException.class);
        } catch (Exception e) {
          //  msException  = new SystemErrorException();
            logger.error(e.getMessage(),e);
        }
        return msException;
    }

    public static byte[] readStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        outSteam.close();
        inStream.close();
        return outSteam.toByteArray();
    }
}
