package com.likelion.codeup.week3.Day11;
import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = 'a';
        while(input != 'q') {
            input = sc.next().charAt(0);
            System.out.println(input);
        }
    }
}