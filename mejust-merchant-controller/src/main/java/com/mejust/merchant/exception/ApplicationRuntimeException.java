package com.mejust.merchant.exception;

/**
 * @author wangmingsen
 * @create 2017-07-26-12:15 PM
 **/

public class ApplicationRuntimeException extends RuntimeException {
    private String code;
    private String msg;

    public ApplicationRuntimeException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApplicationRuntimeException() {
    }

    public ApplicationRuntimeException(Throwable throwable) {
        super(throwable);
    }

    public ApplicationRuntimeException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ApplicationRuntimeException(String message) {
        super(message);
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return this.getClass().getName() + "(code:" + this.code + ", msg:" + this.msg + ", message:" + this.getMessage() + ")";
    }
}