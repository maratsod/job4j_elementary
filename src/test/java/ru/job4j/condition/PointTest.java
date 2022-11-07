package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceHasThenSixPoints() {
        int x1 = 7;
        int y1 = 4;
        int z1 = 3;
        int x2 = 5;
        int y2 = 4;
        int z2 = 3;

        double expected = 2.0;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}