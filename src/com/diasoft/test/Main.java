package com.diasoft.test;

public class Main {

    public static void main(String[] args) {
        boolean paramsIsNotEmpty = checkStringParams(args);
        if (paramsIsNotEmpty) {
            Class1 c1Obj = new Class1(args);
            c1Obj.setStringParamsToSingleTon();
            Class2 c2Obj = new Class2(Singleton.getState().getStringParams());
            c2Obj.showParams();
        } else {
            System.out.println("Params array is empty");
        }
    }

    public static boolean checkStringParams(String[] params) {
        if (params.length < 1) {
            return false;
        }
        return true;
    }
}