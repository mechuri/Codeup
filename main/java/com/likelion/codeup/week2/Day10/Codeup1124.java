package com.likelion.codeup.week2.Day10;
import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String formula = sc.nextLine();
        formula = formula.replaceAll("C","");
        String[] arr = formula.split("H");
        int carbon = Integer.parseInt(arr[0]);
        int hydrogen = Integer.parseInt(arr[1]);
        System.out.println(12 * carbon + hydrogen);
    }
}