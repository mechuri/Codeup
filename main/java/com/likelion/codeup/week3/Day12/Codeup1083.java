package com.likelion.codeup.week3.Day12;
import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1 ; i <= num ; i++ ) {
            if (i % 3 == 0 || i % 6 == 0 || i % 9 == 0) {
                System.out.print("X ");
            }
            else
                System.out.print(i + " ");
        }
    }
}
