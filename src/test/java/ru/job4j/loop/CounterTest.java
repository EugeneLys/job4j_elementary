package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumNumbersFrom1To6Then21() {
        int expected = 21;
        int result = Counter.sum(1, 6);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyThenNinety() {
        int start = 10;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        Assert.assertEquals(expected, result);
    }
}