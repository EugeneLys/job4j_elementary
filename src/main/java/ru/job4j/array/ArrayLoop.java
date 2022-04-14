package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] calc = new int[5];
        for (int index = 0; index < calc.length; index++) {
            calc[index] = index * 2 + 3;
        }
        for (int rsl : calc) {
            System.out.println(rsl);
        }
    }
}
