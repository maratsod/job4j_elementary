package ru.job4j.array;

public class Defragment {
    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        int nullIndex = 0;
        int notNullIndex = 0;
        for (int i = nullIndex; i < array.length; i++) {
            if (array[i] == null) {
                nullIndex = i;
                for (int j = notNullIndex; j < array.length; j++) {
                if (array[j] != null) {
                    notNullIndex = j;
                    Defragment.swap(array, nullIndex, notNullIndex);
                    break;
                } } }
            System.out.print(array[i] + " ");
        }
        return array;
    }


    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}