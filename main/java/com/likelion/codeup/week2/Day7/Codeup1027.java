package com.likelion.codeup.week2.Day7;
import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("\\.");
        System.out.printf("%s-%s-%s",date[2],date[1],date[0]);
    }
}
