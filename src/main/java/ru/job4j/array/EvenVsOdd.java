package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int result = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                even += players[i];
            } else {
                odd += players[i];
            }
        }
        if (even > odd) {
            result = 1;
        }
        if (even < odd) {
            result = 2;
        }
        return result;
    }
}