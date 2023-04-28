package com.likelion.codeup.week2.Day10;
import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num > 0 ? "plus" : "minus");
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
}
