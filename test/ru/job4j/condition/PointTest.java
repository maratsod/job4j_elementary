package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceHasThenFourPoints() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenDistanceHasThenFourPoints1() {
        int x1 = 6;
        int y1 = 3;
        int x2 = 7;
        int y2 = 3;

        double expected = 1.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }
}