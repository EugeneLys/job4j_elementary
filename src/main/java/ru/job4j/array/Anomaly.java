package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0;
        int totalCount = 0;
        int[] temp = new int[data.length];
        int i = 0;
        while (i < data.length) {
            while (data[i] <= down || data[i] >= up) {
                temp[count] = i;
                count++;
                if (i < data.length - 1) {
                    i++;
                } else {
                    break;
                }
            }
            if (count != 0) {
                int[] temp2 = new int[2];
                temp2[0] = temp[0];
                temp2[1] = temp[count - 1];
                result[totalCount] = Arrays.copyOf(temp2, 2);
                count = 0;
                totalCount++;
            }
            i++;
        }
        return Arrays.copyOf(result, totalCount);
    }
}
