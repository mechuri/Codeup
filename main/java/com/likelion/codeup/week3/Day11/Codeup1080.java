package com.likelion.codeup.week3.Day11;
import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (input > sum) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}
