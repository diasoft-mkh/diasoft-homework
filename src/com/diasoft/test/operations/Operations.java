package com.diasoft.test.operations;

public class Operations {

    public int calculateMaxAndMin(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public void showRangeBetweenTwoNumbers(int a, int b) {
        Integer max = calculateMaxAndMin(a, b);
        Integer A = a;
        Integer min;
        if (max.equals(A)) {
            min = b;
        } else {
            min = a;
        }
        if (min.equals(max)) {
            System.out.println("Диапазон содержит только 1 число — " + min + ", так как введённые числа равны");
        } else {
            System.out.println("Диапазон чисел от " + min + " до " + max + " с шагом 1:");
            for (; min <= max; min++) {
                System.out.println(min);
            }
        }
    }
}