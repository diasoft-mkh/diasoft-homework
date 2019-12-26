package com.diasoft.test;

public final class Singleton {
    private static Singleton state = null;
    private String[] params;

    public static synchronized Singleton getState() {
        if (state == null) {
            state = new Singleton();
        }
        return state;
    }

    public void setStringParams(String[] params) {
        this.params = params;
    }

    public String[] getStringParams() {
        return params;
    }
}
