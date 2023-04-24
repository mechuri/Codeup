package com.likelion.codeup.week1.day5;
import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regi_num[] = sc.next().split("-");
        System.out.printf(regi_num[0] + regi_num[1]);
    }
}