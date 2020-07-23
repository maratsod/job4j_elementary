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
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenDistanceHasThenFourPoints1() {
        int x1 = 6;
        int y1 = 3;
        int x2 = 7;
        int y2 = 3;

        double expected = 1.0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenDistanceHasSixPoints() {
        int x1 = 6;
        int y1 = 3;
        int z1 = 4;
        int x2 = 4;
        int y2 = 3;
        int z2 = 4;

        double expected = 2.0;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
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
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}