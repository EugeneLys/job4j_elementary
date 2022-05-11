package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int totalCount = 0;
        int[] temp = new int[data.length];
        int t = 0;
        int r = 0;

        for (int i = r; r < data.length; i++) {
            while (data[i] <= 4 || data[i] >= 16) {
                temp[count] = i;
                count++;
                i++;
                r++;
            }
            if (count != 0) {
                result[totalCount] = Arrays.copyOf(temp, count);
                r++;
                count = 0;
                totalCount++;
            }
        }
        return Arrays.copyOf(result, totalCount);
    }
}
