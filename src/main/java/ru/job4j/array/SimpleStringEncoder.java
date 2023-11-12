package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                if (counter <= 1) {
                    result += "" + symbol;
                } else {
                    result += "" + symbol + counter;
                }
                symbol = input.charAt(i);
                counter = 1;
            }

        }

        if (counter <= 1) {
            result += "" + symbol;
        } else {
            result += "" + symbol + counter;
        }

        return result;
    }

    public static void main(String[] args) {
        String first = "aaaabbbccd";
        String second = "abc";
        String third = "aa";
        System.out.println(encode(first));
        System.out.println(encode(second));
        System.out.println(encode(third));

    }
}