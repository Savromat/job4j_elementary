package ru.job4j.array;

import java.util.Arrays;

public class Machine {

        public static int[] change(int money, int price) {
            int[] coins = {10, 5, 2, 1};
            int[] rsl = new int[100];
            int size = 0;
            int sdacha = money - price;

            for (int i = 0; i < rsl.length; i++) {
                if (sdacha >= 10) {
                    sdacha -= 10;
                    rsl[i] = 10;
                } else if (sdacha >= 5) {
                    sdacha -= 5;
                    rsl[i] = 5;
                } else if (sdacha >= 2) {
                    sdacha -= 2;
                    rsl[i] = 2;
                } else if (sdacha >= 1) {
                    sdacha--;
                    rsl[i] = 1;
                } else if (sdacha == 0) {
                    size = i;
                    break;
                }
            }
            return Arrays.copyOf(rsl, size);
        }
}
