package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        int l = left[left.length - 1];
        int r = right[right.length - 1];
        return l == r;
    }
}
