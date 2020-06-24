package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenToManWeight() {
        double in = 187;

        double expected = 100.05;

        double out = Fit.manWeight(in);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenToWomanWeight() {
        double in = 170;

        double expected = 69.0;

        double out = Fit.womanWeight(in);

        Assert.assertEquals(expected, out, 0.01);

    }
}