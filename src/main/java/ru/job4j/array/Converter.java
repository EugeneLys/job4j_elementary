package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int[] ints : array) {
            count = count + ints.length;
        }
        int[] temp = new int[count];
        int calc = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                temp[calc] = ints[j];
                calc++;
            }
        }
        double count2 = (double) count;
        double count3 = Math.sqrt(count2);
        int resultLength = (int) (Math.ceil(count3));
        calc = 0;
        int[][] result = new int[resultLength][resultLength];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (calc < temp.length) {
                    result[i][j] = temp[calc];
                    calc++;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }
}