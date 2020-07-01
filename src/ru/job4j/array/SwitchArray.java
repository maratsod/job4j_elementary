package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
         source = array[source -1];
         dest = array[dest-1];
        int temp = array[source - 1];
        array[source-1] = array[dest-1];
        array[dest-1] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
        System.out.println(" ");

        int[] rslt = swap(nums, 2, 4);
        for (int index = 0; index < rslt.length; index++) {
            System.out.println(rslt[index]);
        }
    }
}


