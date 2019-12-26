package com.diasoft.test;

public class Class2 {
    private String[] params;

    public Class2(String[] params) {
        this.params = params;
    }

    public void showParams() {
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }
    }
}
