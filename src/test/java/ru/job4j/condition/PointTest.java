package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when11to11then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double expected = 0;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when21to41then2() {
        Point a = new Point(2, 1);
        Point b = new Point(4, 1);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when44to84then4() {
        Point a = new Point(4, 4);
        Point b = new Point(8, 4);
        double expected = 4;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when000to022then2dot82() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 2);
        double expected = 2.82;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when222to222then0() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(2, 2, 2);
        double expected = 0;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when315to462then5dot91() {
        Point a = new Point(3, 1, 5);
        Point b = new Point(4, 6, 2);
        double expected = 5.91;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}