package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapSecondToPenult() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = input.length - (input.length - 1);
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 4, 2, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapThirdToThirdFromTheEnd() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = input.length - (input.length - 2);
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6};
        Assert.assertArrayEquals(expected, result);
    }
}