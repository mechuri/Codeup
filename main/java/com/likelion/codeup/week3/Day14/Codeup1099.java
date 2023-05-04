package com.likelion.codeup.week3.Day14;
import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maze[][] = new int[10][10];

//      미로 입력 받기
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

//      길 찾기
        int xnum = 1;
        int ynum = 1;
        while(true) {
            if (maze[xnum][ynum] == 2) {
                maze[xnum][ynum] = 9;
                break;
            }
            maze[xnum][ynum] = 9;
            if (maze[xnum][ynum+1] == 0 || maze[xnum][ynum+1] == 2) {
                ynum += 1;
                if (maze[xnum][ynum] == 2) {
                    maze[xnum][ynum] = 9;
                    break;
                }
            }
            else if (maze[xnum+1][ynum] == 0 || maze[xnum+1][ynum] == 2) {
                xnum += 1;
                if (maze[xnum][ynum] == 2) {
                    maze[xnum][ynum] = 9;
                    break;
                }
            }
            else {
                maze[xnum][ynum] = 9;
                break;
            }
        }

//      미로 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
