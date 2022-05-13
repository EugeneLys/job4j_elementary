package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        int[][] temp = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp[i][j] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i < row) {
                temp[i][column] = array[i + 1][column];
            }
            if (i > row) {
                temp[i][column] = array[i - 1][column];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i < column) {
                temp[row][i] = array[row][i + 1];
            }
            if (i > column) {
                temp[row][i] = array[row][i - 1];
            }
        }
        temp[row][column] = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = temp[i][j];
            }
        }
    }
}