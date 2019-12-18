package com.diasoft.test.operations;

public class Operations {

    public static int calculateMaxAndMin(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void showRangeBetweenTwoNumbers(int a, int b) {
        int max = calculateMaxAndMin(a, b);
        int min = max == a ? b : a;
        if (min == max) {
            System.out.println("Диапазон чисел пуст, так как введённые числа равны.");
        } else {
            System.out.println("Диапазон чисел от " + min + " до " + max + " с шагом 1:");
            for (; min <= max; min++) {
                System.out.println(min);
            }
        }
    }
}
