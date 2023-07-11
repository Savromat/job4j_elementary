package ru.job4j.calculator;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWoman167Then65dot55() {
        short in = 167;
        double expected = 65.55;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}