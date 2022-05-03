package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] result = new int[(data.length) * (data.length - 1)];
        int r = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i + j != sum) {
                    if (r < result.length) {
                        result[r] = data[i][j];
                        r++;
                    }
                }
            }
        }
        return result;
    }
}