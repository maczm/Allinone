package com.allinone.util;

public enum ResultCode {
    SUCCESS("200", "success"),
    CLIENT_ERROR("400", "client error"),
    UNAUTHORIZED("401", "unauthorized"),
    FORBIDDEN("403", "forbidden"),
    NOT_FOUND("404", "not found"),
    METHOD_NOT_ALLOWED("405", "method not allowed"),
    INTERNAL_ERROR("500", "internal server error"),
    NOT_IMPLEMENTED("501", "not implemented"),
    BAD_GATEWAY("502", "bad gateway"),
    SERVICE_UNAVAILABLE("503", "service unavailable"),
    GATEWAY_TIMEOUT("504", "gateway timeout"),
    DATA_EXISTS("-1", "data already exists"), // 数据已存在
    DATA_NOT_FOUND("-2", "data not found"); // 数据不存在
    
    private final String code;
    private final String msg;
    
    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getMsg() {
        return msg;
    }
}
