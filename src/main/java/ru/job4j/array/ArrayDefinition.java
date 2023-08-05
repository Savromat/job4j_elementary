package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Ira";
        names[2] = "Mat";
        names[3] = "Robin";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
