package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointEqTest {

    @Test
    public void when5And1And5And1ThenEqTrue() {
        boolean result = PointEq.eq(5, 1, 5, 1);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}