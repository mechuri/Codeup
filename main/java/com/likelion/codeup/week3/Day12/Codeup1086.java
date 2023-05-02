package com.likelion.codeup.week3.Day12;
import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%.2f MB", w*h*b/(8.0*1024*1024));
    }
}