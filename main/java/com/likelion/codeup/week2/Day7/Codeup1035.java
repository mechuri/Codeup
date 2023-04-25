package com.likelion.codeup.week2.Day7;
import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int octaNum = Integer.parseInt(str, 16);
        System.out.println(Integer.toOctalString(octaNum));
    }
}