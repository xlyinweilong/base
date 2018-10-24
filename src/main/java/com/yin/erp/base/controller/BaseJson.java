package com.yin.erp.base.controller;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseJson implements Serializable {

    private String message;

    private String code;

    private Object data;

    public BaseJson(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public BaseJson(String message, String code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public static BaseJson getSuccess(String message, Object data) {
        return new BaseJson(message, "0", data);
    }

    public static BaseJson getSuccess(String message) {
        return new BaseJson(message, "0", null);
    }

    public static BaseJson getSuccess(Object data) {
        return new BaseJson("操作成功", "0", data);
    }

    public static BaseJson getSuccess() {
        return new BaseJson("操作成功", "0", null);
    }


}
