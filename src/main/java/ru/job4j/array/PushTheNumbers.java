package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int[][] temp = array;
        int i = 0;
        while (i < array.length) {
            while (i < row) {
                temp[i][column] = array[i + 1][column];
                i++;
            }
            if (i == row) {
                i++;
            }
            while (i > row) {
                temp[i][column] = array[i - 1][column];
                if (i < array.length - 1) {
                    i++;
                }
            }
        }

        i = 0;
        while (i < array.length) {
            while (i < column) {
                temp[row][i] = array[row][i + 1];
                i++;
            }
            if (i == column) {
                i++;
            }
            while (i > column) {
                temp[row][i] = array[row][i - 1];
                if (i < array.length - 1) {
                    i++;
                }
            }
        }
        temp[row][column] = 0;
        for (int j = 0; j < array.length; j++) {
            array[row][j] = temp[row][j];
        }
        for (int j = 0; j < array.length; j++) {
            array[j][column] = temp[j][column];
        }
    }
}