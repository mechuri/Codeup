package com.likelion.codeup.week4.Day15;
import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num ; i > 0 ; i--) {
            for (int j = 1 ; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0 ; j < num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}