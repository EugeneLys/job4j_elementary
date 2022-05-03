package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                rsl[i] = left[l];
                l++;
            } else {
                rsl[i] = right[r];
                r++;
            }
            i++;
        }

        while (l < left.length) {
            rsl[i] = left[l];
            l++;
            i++;
        }

        while (r < right.length) {
            rsl[i] = right[r];
            r++;
            i++;
        }
        return rsl;
    }
}