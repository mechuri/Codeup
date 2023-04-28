package com.likelion.codeup.week2.Day10;
import java.util.Scanner;

public class Codeup1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0 ; i < num ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0 ; i < num-1 ; i++ ) {
            for (int j=0 ; j < num-i-1 ; j++ ) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0 ; i < num ; i++) {
            System.out.println(arr[i]);
        }
    }
}