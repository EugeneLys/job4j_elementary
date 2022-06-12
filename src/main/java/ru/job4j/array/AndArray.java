package ru.job4j.array;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[]temp = new int[left.length + right.length];
        int count = 0;
        for (int k : left) {
            for (int i : right) {
                if (i == k) {
                    temp[count] = i;
                    count++;
                }
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
