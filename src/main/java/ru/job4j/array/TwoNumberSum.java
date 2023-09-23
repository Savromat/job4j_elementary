package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] array2 = {};
        while (i < array.length) {
            if (array[i] + array[j] == target) {
                array2 = new int[] {i, j};
                break;
            } else if (array[i] + array[j] > target) {
                j--;
            } else if (array[i] + array[j] < target) {
                i++;
            }
        }
        return array2;
    }
}