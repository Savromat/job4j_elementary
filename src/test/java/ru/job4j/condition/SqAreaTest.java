package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K1Square4() {
        double expected = 4;
        double p = 8;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP6K3Square1dot69() {
        double expected = 1.69;
        double p = 6;
        double k = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}