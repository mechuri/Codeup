package com.likelion.codeup.week3.Day13;
import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                num = 1;
                break;
            }
        }
        System.out.println(num == 1 ? "not prime" : "prime");
    }
}
