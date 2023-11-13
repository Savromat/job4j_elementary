package ru.job4j.calculator;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class JUnitExampleTest {

    @Test
    @DisplayName("When 5 multi 5 should be 25")
    void when5and5then25() {
        JUnitExample j = new JUnitExample();
        int result = j.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }
}