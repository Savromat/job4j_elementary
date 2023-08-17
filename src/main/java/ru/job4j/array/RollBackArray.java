package ru.job4j.array;

public class RollBackArray {

    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, -3, 4};
        int[] nums2 = rollback(nums1);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
