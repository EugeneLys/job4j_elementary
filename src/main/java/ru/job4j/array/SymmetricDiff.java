package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rightTemp = new int[right.length];
        int[] leftTemp = new int[left.length];
        int[] temp = new int[left.length + right.length];
        int t = 0;
        int l = 0;
        int r = 0;

        if (left.length == 0 && right.length == 0) {
            return temp;
        }

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

        if (left.length != 0 && right.length != 0) {
            for (int i = 0; i < left.length; i++) {
                for (int j = 0; j < right.length; j++) {
                    if (right[j] == left[i]) {
                        rightTemp[r] = j;
                        leftTemp[l] = i;
                        r++;
                        l++;
                    }
                }
            }

            if (r > 0) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < right.length; j++) {
                        if (j != rightTemp[i]) {
                            temp[t] = right[j];
                            t++;
                        }
                    }
                }
            } else {
                for (int i : right) {
                    temp[t] = i;
                    t++;
                }
            }

            if (l > 0) {
                for (int i = 0; i < l; i++) {
                    for (int j = 0; j < left.length; j++) {
                        if (j != leftTemp[i]) {
                            temp[t] = left[j];
                            t++;
                        }
                    }
                }
            } else {
                for (int i : left) {
                    temp[t] = i;
                    t++;
                }
            }

        }
            int[] result = new int[t];
            System.arraycopy(temp, 0, result, 0, result.length);
            Arrays.sort(result);
            return result;
    }
}
