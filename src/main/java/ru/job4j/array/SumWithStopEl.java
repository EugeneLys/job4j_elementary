package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int result = 0;
        int sum = 0;
        int index = 0;
        while (data[index] != el) {
            sum += data[index];
            index++;
        }
        if (sum % 2 == 0) {
            result = sum;
        }
        return result;
    }
}