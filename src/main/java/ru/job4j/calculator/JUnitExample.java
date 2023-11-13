package ru.job4j.calculator;

public class JUnitExample {

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        JUnitExample j = new JUnitExample();
        System.out.println(j.multiply(5, 5));
    }
}
