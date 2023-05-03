package com.likelion.codeup.week3.Day13;
import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int diff = sc.nextInt();
        int num = sc.nextInt();
        double answer = start * Math.pow(diff,num-1);
        System.out.println((long)answer);
    }
}