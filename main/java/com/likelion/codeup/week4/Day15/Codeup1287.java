package com.likelion.codeup.week4.Day15;
import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1 ; i < 10 ; i++) {
            for (int j = 0 ; j < i * num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
