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

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {2, 4, 6, 8, 10};
        int el = 8;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas8Then3() {
        int[] data = new int[] {2, 4, 6, 8, 10};
        int el = 8;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}