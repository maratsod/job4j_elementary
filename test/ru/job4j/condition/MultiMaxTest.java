package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax1() {
        int result = MultiMax.max(1, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax2() {
        int result = MultiMax.max(2, 1, 3);
        assertThat(result, is(3));
    }
}