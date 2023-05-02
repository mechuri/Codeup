package com.likelion.codeup.week3.Day12;
import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        System.out.printf("%.1f MB", h*b*c*s/(8.0*1024*1024));
    }
}