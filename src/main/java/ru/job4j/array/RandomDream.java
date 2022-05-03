package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String result;
        while (num > prizes.length) {
            num -= prizes.length;
        }
        result = prizes[num - 1];
        return result;
    }
}
