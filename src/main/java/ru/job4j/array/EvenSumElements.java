package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        boolean check = true;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        if (sum % 2 != 0) {
            check = false;
        }
        return check;
    }
}