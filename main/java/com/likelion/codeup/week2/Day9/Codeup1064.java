package com.likelion.codeup.week2.Day9;
import java.util.Arrays;
import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int arr[] = {num1, num2, num3};
        Arrays.sort(arr);
        System.out.println(arr[0]);
//        System.out.println((num1 < num2 ? num1 : num2) > num3 ? num3 : (num1 < num2 ? num1 : num2));
    }
}
