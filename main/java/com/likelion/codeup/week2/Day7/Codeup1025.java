package com.likelion.codeup.week2.Day7;
import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.next().split("");
        for (int i = 0 ; i < str.length; i++) {
            System.out.print("["+ str[i]);
            for (int j = str.length-1 ; j>i ; j--){
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}


//public class Codeup1025 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str[] = sc.next().split("");
//        for (int i = 0 ; i < str.length ; i++) {
//            System.out.println("["+ str[i] + "0".repeat(str.length-i-1)+ "]");
//        }
//    }
//}