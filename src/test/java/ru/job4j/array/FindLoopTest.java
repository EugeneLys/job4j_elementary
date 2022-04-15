package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHasMinus6Then5() {
        int[] data = {5, 4, 3, 2, 100, -6};
        int el = -6;
        int result = FindLoop.indexOf(data, -6);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, 5);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {6, 5, 4, 3, 2};
        int el = 10;
        int result = FindLoop.indexOf(data, 10);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}