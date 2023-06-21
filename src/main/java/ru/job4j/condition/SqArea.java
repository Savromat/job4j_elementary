package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        return (k * Math.pow(p, 2)) / (4 * Math.pow((k + 1), 2));
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}
