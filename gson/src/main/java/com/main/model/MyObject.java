package com.main.model;

import java.util.Map;

public class MyObject {

    private String msisdn;
    private String po;
    private String action;
    private Map<String, Object> responseValue;

    public MyObject() {
    }

    public MyObject(String msisdn, String po, String action, Map<String, Object> responseValue) {
        this.msisdn = msisdn;
        this.po = po;
        this.action = action;
        this.responseValue = responseValue;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, Object> getResponseValue() {
        return responseValue;
    }

    public void setResponseValue(Map<String, Object> responseValue) {
        this.responseValue = responseValue;
    }
}
