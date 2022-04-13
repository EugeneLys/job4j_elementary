package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            s = "empty";

        } else {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (i < sb.length() - 4) {
                    sb.setCharAt(i, '#');
                }
                s = sb.toString();
            }
        }
        return s;
    }
}
