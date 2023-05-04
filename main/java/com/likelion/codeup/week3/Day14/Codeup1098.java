package com.likelion.codeup.week3.Day14;
import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int num = sc.nextInt();
        int board[][] = new int[height][width];

        for (int i = 0; i < num; i++) {
            int len = sc.nextInt();
            int direction = sc.nextInt();
            int xnum = sc.nextInt();
            int ynum = sc.nextInt();

            for (int j = 0; j < len; j++) {
                if (direction == 0) {
                    board[xnum - 1][ynum - 1 + j] = 1;
                } else {
                    board[xnum - 1 + j][ynum - 1] = 1;
                }
            }
        }

//      바둑판 출력
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
