package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i].length;
        }
        int[] temp = new int[count];
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[t] = array[i][j];
                t++;
            }
        }
        double count2 = (double) count;
        double count3 = Math.sqrt(count2);
        int resultLength = (int) (Math.ceil(count3));
        t = 0;
        int[][] result = new int[resultLength][resultLength];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (t < temp.length) {
                    result[i][j] = temp[t];
                    t++;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}