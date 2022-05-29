package Pyramid;

import java.io.IOException;
import java.util.Scanner;

public class Pyramid {
    public static char[][] array;
    public static char grid = '#';
    public static char wSpace = ' ';
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        int height = console.nextInt();
//        int height = 5; //Test value
        int width = 2 * height - 1;
        array = new char[height][width];
        for (int i = height - 1; i > -1; i--) {
            count = (2 * height - 1) - (2 * i + 1);
            for (int j = 0; j < width; j++) {
                if (count == 0) {
                    array[i][j] = grid;
                } else if (j < count / 2 || j > width - (count / 2) - 1) {
                    array[i][j] = wSpace;
                } else {
                    array[i][j] = grid;
                }
            }
        }
        for (char[] h : array) {
            for (char w : h) {
                System.out.print(w);
            }
            System.out.println();
        }
    }
}
