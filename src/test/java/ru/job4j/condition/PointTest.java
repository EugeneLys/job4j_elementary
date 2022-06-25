package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01To10Then1Dot41() {
        double expected = 1.41;
        Point point1 = new Point(0, 1);
        Point point2 = new Point(1, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55To77Then2Dot82() {
        double expected = 2.82;
        Point point1 = new Point(5, 5);
        Point point2 = new Point(7, 7);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15ToMinus1Minus2Then7Dot28() {
        double expected = 7.28;
        Point point1 = new Point(1, 5);
        Point point2 = new Point(-1, -2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}