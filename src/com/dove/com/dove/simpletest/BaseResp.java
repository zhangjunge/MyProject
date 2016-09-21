package com.dove.com.dove.simpletest;

/**
 * Created by dove.zhang on 2016/7/5.
 */
public class BaseResp<T> {


    private int status;
    private String error;
    private String msg;
    private T data;

    public BaseResp() {
        this.status = 1;
        this.msg = "OK";
        this.error = "200";
    }

    public BaseResp(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public BaseResp(int status, String msg, String error) {
        this.status = status;
        this.msg = msg;
        this.error = error;
    }

    public BaseResp(int status, String msg, String error, T data) {
        this.status = status;
        this.msg = msg;
        this.error = error;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseResp{");
        sb.append("status=").append(status);
        sb.append(", error='").append(error).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }


}
