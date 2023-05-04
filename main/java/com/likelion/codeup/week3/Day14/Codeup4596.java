package com.likelion.codeup.week3.Day14;
import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int max = 0;
        int xnum = 0;
        int ynum = 0;

        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    xnum = i;
                    ynum = j;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", xnum+1, ynum+1);
    }
}