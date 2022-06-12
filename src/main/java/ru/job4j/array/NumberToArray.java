package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int count = 1;
        int temp = number;
        while (temp > 10) {
            temp = (int) (temp / 10);
            count++;
            }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = number % 10;
            number = number / 10;
        }
        return result;
    }
}
