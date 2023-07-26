package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paint(3, 3);
        System.out.println();
        Board.paint(4, 4);
    }
}
