package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSquareToSqArea() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }
    @Test
    public void whenSquareToSqArea1() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }

}