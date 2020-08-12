package com.gahui.ghmall.comm.vo;

import com.gahui.ghmall.comm.en.GhResponseEnum;

/**
 * @description: 通用返回
 * @author: liaojiaxi
 * @date: 2020/8/6
 **/

public class GhResponse<T> {

    private String rspCode;

    private String rspMessage;

    private T rspData;

    public GhResponse() {
    }

    public GhResponse(String rspCode) {
        this.rspCode = rspCode;
    }

    public GhResponse(String rspCode, String rspMessage) {
        this.rspCode = rspCode;
        this.rspMessage = rspMessage;
    }

    public GhResponse(GhResponseEnum responseEnum) {
        this.rspCode = responseEnum.getCode();
        this.rspMessage = responseEnum.getMessage();
    }

    public GhResponse(String rspCode, String rspMessage, T rspData) {
        this.rspCode = rspCode;
        this.rspMessage = rspMessage;
        this.rspData = rspData;
    }

    public GhResponse(GhResponseEnum responseEnum, T rspData) {
        this.rspCode = responseEnum.getCode();
        this.rspMessage = responseEnum.getMessage();
        this.rspData = rspData;
    }

    public GhResponse(String rspCode, T rspData) {
        this.rspCode = rspCode;
        this.rspData = rspData;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspMessage() {
        return rspMessage;
    }

    public void setRspMessage(String rspMessage) {
        this.rspMessage = rspMessage;
    }

    public T getRspData() {
        return rspData;
    }

    public void setRspData(T rspData) {
        this.rspData = rspData;
    }

    public void setCodeAndMessageByEnum(GhResponseEnum ghEnum){
        this.rspCode = ghEnum.getCode();
        this.rspMessage = ghEnum.getMessage();
    }

    public void setCodeAndMessageAndDataByEnum(GhResponseEnum ghEnum,T t){
        this.rspCode = ghEnum.getCode();
        this.rspMessage = ghEnum.getMessage();
        this.rspData = t;
    }

    @Override
    public String toString() {
        return "GhResponse{" +
                "rspCode='" + rspCode + '\'' +
                ", rspMessage='" + rspMessage + '\'' +
                ", rspData=" + rspData +
                '}';
    }
}
