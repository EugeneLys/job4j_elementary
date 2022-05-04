package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {

        int[] temp = new int[left.length];
        int t = 0;
        if (left.length != 0 && right.length != 0) {
            for (int i = 0; i < left.length; i++) {
                for (int k : right) {
                    if (left[i] == k) {
                        break;
                    } else {
                        temp[t] = left[i];
                        t++;
                    }
                }
            }
        }

        if (right.length == 0) {
            for (int j : left) {
                temp[t] = j;
                t++;
            }
        }

        int[] result = new int[t];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;

    }
}
