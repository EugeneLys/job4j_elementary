package ru.job4j.array;
import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] temp = new int[left.length + right.length];
        int index = 0;
        if (left.length != 0 && right.length != 0) {
            for (int j : left) {
                temp[index] = j;
                index++;
            }
            for (int j : right) {
                temp[index] = j;
                index++;
            }
            Arrays.sort(temp);
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i] == temp[i + 1]) {
                    temp[i] = 0;
                    index--;
                }
            }
            Arrays.sort(temp);
        }
        if (left.length == 0) {
            for (int j : right) {
                temp[index] = j;
                index++;
            }
        }
        if (right.length == 0) {
            for (int j : left) {
                temp[index] = j;
                index++;
            }
        }

        int[] result = new int[index];
        return rotate(temp, result);
    }

        public static int[] rotate(int[] src, int[] rsl) {
            int k = 0;
            for (int j : src) {
                if (j != 0) {
                    rsl[k] = j;
                    k++;
                }
            }
            return rsl;
        }

}
