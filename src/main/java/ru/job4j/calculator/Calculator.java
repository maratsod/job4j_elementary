package ru.job4j.calculator;

public class Calculator {
    public static int plus(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        int rsl1 = Calculator.plus(1, 2);
        int rsl2 = Calculator.plus(10, 11);
        System.out.println(rsl1);
        System.out.println(rsl2);
    }
}

