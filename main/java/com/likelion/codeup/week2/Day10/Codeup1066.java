package com.likelion.codeup.week2.Day10;
import java.util.Scanner;

public class Codeup1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int arr[] = {num1, num2, num3};
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}