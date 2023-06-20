package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int x3 = x2 - x1;
        int y3 = y2 - y1;
        double x = Math.pow(x3, 2);
        double y = Math.pow(y3, 2);
        double rsl = x + y;
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double d1 = Point.distance(2, 4, 6, 8);
        double d2 = distance(3, 5, 11, 17);
        System.out.println(d1);
        System.out.println(d2);
    }
}
