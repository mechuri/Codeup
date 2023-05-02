package com.likelion.codeup.week3.Day11;
import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int num = (int)input;
        for (int i = 97 ; i <= num ; i++) {
            System.out.printf("%c\n", (char)i);
        }
    }
}

