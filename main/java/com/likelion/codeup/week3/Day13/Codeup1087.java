package com.likelion.codeup.week3.Day13;
import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (sum < num);
        System.out.println(sum);
    }
}
