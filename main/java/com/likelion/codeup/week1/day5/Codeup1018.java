package com.likelion.codeup.week1.day5;
import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split(":");
        System.out.printf("%s:%s", time[0], time[1]);
    }
}