package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean result = false;
        int negative = 0;
        for (int i : data) {
            if (i < 0) {
                negative++;
            }
        }
        if (negative % 2 != 0) {
            result = true;
        }
        return result;
    }
}