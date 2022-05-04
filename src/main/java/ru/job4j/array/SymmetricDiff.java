package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] temp = new int[left.length + right.length];
        int t = 0;

        if (left.length == 0) {
            for (int j : right) {
                temp[t] = j;
                t++;
            }
        }
        if (right.length == 0) {
            for (int j : left) {
                temp[t] = j;
                t++;
            }
        }
        int[] result = new int[t];
        return result;
    }
}
