package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {

        for (int i = left.length -1; 0 < i; i--) {
            for (int j = right.length -i; 0 < j; j--) {
                if (left[i] == right[i]) {
                    return true;
                }
            }
        }
        return false;
}
}