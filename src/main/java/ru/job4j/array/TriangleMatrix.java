package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int arrayStarter = 0;
        for (int i = 0; i < count; i++) {

            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = arrayStarter + 1;
            arrayStarter++;
            }
        }
    return triangle;
    }
}