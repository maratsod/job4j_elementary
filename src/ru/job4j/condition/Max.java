package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return max(temp, third);
    }
    public static int max(int first, int second, int third, int forth) {
        int temp = max(first, second);
        int temp1 = max(temp, third);
        return max(temp1, forth);
    }
}
