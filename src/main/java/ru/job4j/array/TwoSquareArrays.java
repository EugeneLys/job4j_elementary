package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * left.length];
        int x = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (left[i][j] >= right[i][j]) {
                    result[x] = left[i][j];
                    x++;
                } else {
                    result[x] = right[i][j];
                    x++;
                }
            }
        }
        return result;
    }
}