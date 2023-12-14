package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int high) {
        return high > max(left, right) ? high : max(left, right);
    }

    public static int max(int left, int right, int high, int bottom) {
        return max(high, bottom) > max(left, right) ? max(high, bottom) : max(left, right);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 4));
        System.out.println(Max.max(5, 4, 6));
        System.out.println(Max.max(5, 4, 6, 7));
    }
}
