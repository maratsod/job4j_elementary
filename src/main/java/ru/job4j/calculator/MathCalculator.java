package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;
import static ru.job4j.math.MathFunction.sum;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double allMethods(double first, double second) {
        return sub(first, second)
                + sum(first, second) + div(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDiv(30, 20));
        System.out.println("Результат расчета равен: " + allMethods(40, 20));
    }
}


/*
один будет считать сумму двух операций из класса MathFunction: разность двух чисел и деление двух чисел.

- второй метод будет рассчитывать сумму вычисления всех четырех операций из класса MathFunction.


 */