package ru.job4j.calculate;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;

        int rsl = X2.calc(a, b, c, x);

        assertThat(rsl, is(expected));
    }

    @Test
    public void whenBCZero1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;

        int rsl = X2.calc(a, b, c, x);

        assertThat(rsl, is(expected));
    }

    @Test
    public void whenBCZero2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;

        int rsl = X2.calc(a, b, c, x);

        assertThat(rsl, is(expected));
    }

    @Test
    public void whenBCZero3() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;

        int rsl = X2.calc(a, b, c, x);

        assertThat(rsl, is(expected));
    }

    @Test
    public void whenBCZero4() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;

        int rsl = X2.calc(a, b, c, x);

        assertThat(rsl, is(expected));
    }
}