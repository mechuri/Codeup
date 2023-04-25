package com.likelion.codeup.week2.Day7;
import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.next().split("");
        for (int i = 0 ; i < str.length ; i++) {
            System.out.printf("\'%s\'\n",str[i]);
        }
    }
}
