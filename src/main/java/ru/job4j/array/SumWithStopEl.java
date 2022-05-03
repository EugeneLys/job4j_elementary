package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int result = 0;
        int sum = 0;
        int i = 0;
        while (data[i] != el) {
            sum += data[i];
            i++;
        }
        if (sum % 2 == 0) {
            result = sum;
        }
        return result;
    }
}