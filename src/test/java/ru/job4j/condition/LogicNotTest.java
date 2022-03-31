package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class LogicNotTest {

    @Test
    public void when2ThenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when2ThenIsPositiveTrue() {
        int num = 2;
        boolean result = LogicNot.isPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3ThenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMinus2NotPositiveTrue() {
        int num = -2;
        boolean result = LogicNot.notPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when1NotEvenAndPositiveTrue() {
        boolean result = LogicNot.notEvenAndPositive(1);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMinus1EvenOrNotPositiveTrue() {
        boolean result = LogicNot.evenOrNotPositive(-1);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}