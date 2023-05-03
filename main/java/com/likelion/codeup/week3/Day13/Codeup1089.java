package com.likelion.codeup.week3.Day13;
import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int diff = sc.nextInt();
        int num = sc.nextInt();

        System.out.println(start + diff * (num-1));
    }
}