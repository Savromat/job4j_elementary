package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] array = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', 'X', ' '},
        };
        System.out.println(MatrixCheck.monoHorizontal(array, 1));
    }
}
