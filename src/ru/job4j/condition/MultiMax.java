package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int maximum = first > second ? first : second;
        int result = maximum > third ? maximum : third;
        return result;
    }
}
