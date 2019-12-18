package com.diasoft.test;

import com.diasoft.test.operations.*;

public class Main {

    public static void main(String[] args) {

        try {
            Operations oper = new Operations();

            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);

            System.out.println("Введённые числа:");
            System.out.println("Число 1: " + a);
            System.out.println("Число 2: " + b);
            System.out.println();
            System.out.println("Максимальное число: " + oper.calculateMaxAndMin(a, b));
            System.out.println();
            oper.showRangeBetweenTwoNumbers(a, b);

        } catch (NumberFormatException ex) {
            System.out.println("Одно или оба числа введены с ошибкой!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Введены не все числа!");
        }
    }

}