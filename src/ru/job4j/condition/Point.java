package ru.job4j.condition;
import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = Math.pow((x2-x1), 2);
        double b = Math.pow((y2-y1), 2);
        double c = Math.sqrt(a + b);
        return c;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 3, 6, 3);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 3) to (6, 3) " + result1);
    }
}
