package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        char[] result = new char[seq.length];
        for (int i = 0; i < result.length; i++) {
            if (i < 5) {
                result[i] = '0';
            } else if (i > result.length - 6) {
                result[i] = '1';
            } else {
                result[i] = seq[i];
            }
        }
        return result;
    }
}
