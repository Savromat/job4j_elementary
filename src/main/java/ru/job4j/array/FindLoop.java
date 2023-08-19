package ru.job4j.array;

public class FindLoop {

    public  static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(FindLoop.indexOf(new int[] {5, 10, 3}, 3));
        System.out.println(FindLoop.indexInRange(new int[] {5, 10, 3, 6, 9, 2}, 6, 1, 4));
    }
}
