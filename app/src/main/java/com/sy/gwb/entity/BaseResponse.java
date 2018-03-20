package com.sy.gwb.entity;

/**
 * Created by ${GongWenbo} on 2018/3/19 0019.
 */

public class BaseResponse<T>  {

    private String reason;
    private T      result;
    private String resultcode;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }
}
