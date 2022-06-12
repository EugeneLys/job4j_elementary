package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] temp = new int[left.length];
        int count = 0;
        if (left.length != 0 && right.length != 0) {
            for (int j : left) {
                for (int k : right) {
                    if (j == k) {
                        break;
                    } else {
                        temp[count] = j;
                        count++;
                    }
                }
            }
        }

        if (right.length == 0) {
            for (int j : left) {
                temp[count] = j;
                count++;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;

    }
}
