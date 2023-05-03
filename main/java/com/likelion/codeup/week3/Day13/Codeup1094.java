package com.likelion.codeup.week3.Day13;
import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student[] = new int[23];
        int num = sc.nextInt();
        int arr[] = new int[num];

//      무작위 출석 번호 입력 받기
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
//      거꾸로 출력
        for (int i = num-1 ; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}