package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MultipleSwitchWeekTest {

    @Test
    public void whenAprilthenNumberOfDayMinus1() {
        String name = "April";
        int rsl = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenFridaythenNumberOfDay5() {
        String name = "Friday";
        int rsl = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenFriddaythenNumberOfDayMinus1() {
        String name = "Fridday";
        int rsl = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(rsl, expected);
    }
}