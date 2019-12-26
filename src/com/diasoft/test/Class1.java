package com.diasoft.test;

public class Class1 {
    private String[] params;

    public Class1(String[] params) {
        this.params = params;
    }

    public String[] getParamsArray() {
        return params;
    }

    public void setStringParamsToSingleTon() {
        Singleton.getState().setStringParams(params);
    }
}