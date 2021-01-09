package com.phy.px.model;

/**
 * @Author 裴浩宇
 * @Date 2021/1/9 10:09
 * 返回值对象
 */
public class ReturnObject {
    /**code值
     * 200  正常
     * 500  异常
     */
    Integer code;
    /**
     * 提示内容
     */
    String message;
    /**
     * 返回数据
     */
    Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
