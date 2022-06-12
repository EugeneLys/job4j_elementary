package ru.job4j.array;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] result = new int[(data.length) * (data.length - 1)];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i + j != sum) {
                    if (index < result.length) {
                        result[index] = data[i][j];
                        index++;
                    }
                }
            }
        }
        return result;
    }
}