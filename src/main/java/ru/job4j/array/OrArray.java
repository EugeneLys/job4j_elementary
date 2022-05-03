package ru.job4j.array;
import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] temp = new int[left.length + right.length];
        int t = 0;
        if (left.length != 0 && right.length != 0) {
            for (int j : left) {
                temp[t] = j;
                t++;
            }
            for (int j : right) {
                temp[t] = j;
                t++;
            }
            Arrays.sort(temp);
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i] == temp[i + 1]) {
                    temp[i] = 0;
                    t--;
                }
            }
            Arrays.sort(temp);
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
        int[] result = new int[t];
        int k = 0;
        for (int j : temp) {
            if (j != 0) {
                result[k] = j;
                k++;
            }
        }
        return result;
    }
}
