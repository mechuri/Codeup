package com.likelion.codeup.week1.day5;
import java.util.Scanner;

// Split string with dot : https://hianna.tistory.com/618
public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("\\.");

        System.out.printf("%04d.%02d.%02d", Integer.parseInt(date[0]), Integer.parseInt(date[1]),Integer.parseInt(date[2]));
    }
}