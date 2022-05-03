package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[]temp = new int[left.length + right.length];
        int t = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (right[j] == left[i]) {
                    temp[t] = right[j];
                    t++;
                }
            }
        }
        int[] result = new int[t];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
