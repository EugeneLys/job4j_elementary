package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbNew = new StringBuilder();
        int count = 0;
        for (int i = 0; i <= sb.length()-1; i++) {
            if (i == sb.length()-1) {
                sbNew.append(sb.charAt(i-count));
            }
            if (sb.charAt(i) == ' ') {
                sbNew.append(sb.charAt(i-count));
                count = -1;
            }
            count++;
        }
       s = sbNew.toString();
        return s;
    }
}