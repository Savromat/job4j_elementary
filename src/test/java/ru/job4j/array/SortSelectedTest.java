package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort5numbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort3numbers() {
        int[] data = new int[] {9, 7, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort4numbers() {
        int[] data = new int[] {0, -1, 8, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 0, 5, 8};
        assertThat(result).containsExactly(expected);
    }
}