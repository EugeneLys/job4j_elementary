package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void when1nameOfDayMonday() {
        int day = 1;
        String expected = "Понедельник";
        String rsl = SwitchWeek.nameOfDay(1);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when9nameOfDayMistake() {
        int day = 9;
        String expected = "Ошибка";
        String rsl = SwitchWeek.nameOfDay(9);
        Assert.assertEquals(expected, rsl);
    }
}