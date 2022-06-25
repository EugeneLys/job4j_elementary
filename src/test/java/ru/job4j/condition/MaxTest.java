package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1to2then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100to150then150() {
        int left = 100;
        int right = 150;
        int result = Max.max(left, right);
        int expected = 150;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10toMinus10then10() {
        int left = 10;
        int right = -10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when1To2to10Then10() {
        int first = 1;
        int second = 2;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when1To2to100To10Then100() {
        int first = 1;
        int second = 2;
        int third = 100;
        int fourth = 10;
        int result = Max.max(first, second, third, fourth);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
}