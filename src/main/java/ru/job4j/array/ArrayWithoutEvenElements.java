package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int count = 0;
        int[] counter = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                counter[count] = data[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = counter[i];
        }
        return result;
    }
}