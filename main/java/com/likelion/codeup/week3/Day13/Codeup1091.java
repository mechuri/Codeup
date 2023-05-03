package com.likelion.codeup.week3.Day13;
import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        int diff1 = sc.nextInt();
        int diff2 = sc.nextInt();
        int num = sc.nextInt();

        for (int i = 0 ; i < num-1 ; i++) {
            start = (start*diff1)+diff2;
        }

        System.out.println(start);
    }
}