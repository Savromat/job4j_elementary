package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor5Then120() {
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int expected = 1;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int n = 1;
        int expected = 1;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }
}