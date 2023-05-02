package com.likelion.codeup.week3.Day11;
import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 2 ; i <= num  ; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}