package com.likelion.codeup.week3.Day12;
import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int hex_num = Integer.parseInt(num, 16);

        for (int i = 1 ; i < 16 ; i++) {
            System.out.printf("%X*%X=%X\n", hex_num, i, hex_num*i);
        }
    }
}