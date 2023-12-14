package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then1() {
        int left = 5;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then1Or2() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To3Then1O() {
        int left = 8;
        int right = 9;
        int high = 10;
        int result = Max.max(left, right, high);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3Then9() {
        int left = 9;
        int right = 9;
        int high = 5;
        int result = Max.max(left, right, high);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To4Then1O() {
        int left = 8;
        int right = 9;
        int high = 10;
        int bottom = 5;
        int result = Max.max(left, right, high, bottom);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To4Then9() {
        int left = 8;
        int right = 9;
        int high = 9;
        int bottom = 5;
        int result = Max.max(left, right, high, bottom);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}