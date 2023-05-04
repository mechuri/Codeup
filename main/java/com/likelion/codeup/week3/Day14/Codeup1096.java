package com.likelion.codeup.week3.Day14;
import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int go[][] = new int[19][19];
        int cnt = sc.nextInt();

//      흰 돌 위치 입력 받기
        for (int i = 0 ; i < cnt ; i++) {
            int xnum = sc.nextInt();
            int ynum = sc.nextInt();
            go[xnum-1][ynum-1] = 1;
        }

//      바둑판 출력
        for (int i = 0 ; i < 19 ; i++) {
            for (int j = 0 ; j < 19 ; j++) {
                System.out.print(go[i][j] + " ");
            }
            System.out.println();
        }
    }
}

