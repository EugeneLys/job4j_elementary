package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                count++;
            }
        }
        if (count >= data.length / 2) {
            check = false;
        }
        return check;
    }
}