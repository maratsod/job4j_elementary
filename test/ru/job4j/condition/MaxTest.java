package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2 () {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3 () {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To3Then3() {
        int result = Max.max(2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(2, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax1To3Then3() {
        int result = Max.max(2, 1, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax4To4Then2() {
        int result = Max.max(2, 3, 1, 4);
        assertThat(result, is(4));
    }
}