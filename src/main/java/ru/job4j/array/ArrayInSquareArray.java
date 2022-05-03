package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        double temp = (double) array.length;
        double temp2 = Math.sqrt(temp);
        int temp3 = (int) (temp2 + 1);
        int[][] result = new int[temp3][temp3];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (count < array.length) {
                    result[i][j] = array[count];
                    count++;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}