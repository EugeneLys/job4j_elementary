package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean result = false;
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        if (negative % 2 != 0) {
           result = true;
        }
        return result;
    }
}