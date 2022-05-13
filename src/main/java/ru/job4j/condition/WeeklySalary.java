package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    result = result + hours[i] * 10;
                } else {
                    result = result + (8 * 10) + (hours[i] - 8) * 15;
                }
            } else {
                if (hours[i] <= 8) {
                    result = result + hours[i] * 20;
                } else {
                    result = result + (8 * 20) + (hours[i] - 8) * 30;
                }
            }
        }
        return result;
    }
}