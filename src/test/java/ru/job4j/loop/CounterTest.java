package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void when1To6ThenSum21() {
        int expected = 21;
        int result = Counter.sum(1, 6);
        Assert.assertEquals(expected, result);
    }
}