package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = new int[]{1000, 50, 250};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{50, 250, 1000};
        Assert.assertArrayEquals(expected, result);
    }
}