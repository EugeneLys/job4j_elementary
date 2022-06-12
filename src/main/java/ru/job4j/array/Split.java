package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 0;
        int pos = 0;
            for (int i = 0; i < result.length && pos < str.length; i++) {
                char[] temp = new char[str.length];
                int count = 0;
                for (int j = pos; j < str.length; j++) {
                    if (str[j] != c) {
                        temp[count] = str[j];
                        count++;
                        pos++;
                    } else {
                        pos++;
                        break;
                    }
                }
                result[i] = Arrays.copyOf(temp, count);
                count = 0;
                commonCount++;
            }
        return Arrays.copyOf(result, commonCount);
    }
}
