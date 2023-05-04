package com.likelion.codeup.week3.Day14;
import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int go[][] = new int[19][19];

//      바둑판 입력 받기
        for (int i = 0 ; i < 19 ; i++) {
            for (int j = 0 ; j < 19 ; j++) {
                go[i][j] = sc.nextInt();
            }
        }

        int cnt = sc.nextInt();
        for (int i = 0 ; i < cnt ; i++) {
            int xnum = sc.nextInt();
            int ynum = sc.nextInt();
            int temp = 0;

//          바둑알 뒤집기
            while (temp < 19) {
                go[xnum-1][temp] = go[xnum-1][temp] == 0 ? 1 : 0;
                temp++;
            }

            temp = 0;
            while (temp < 19) {
                go[temp][ynum-1] = go[temp][ynum-1] == 0 ? 1 : 0;
                temp++;
            }
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