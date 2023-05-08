package com.likelion.codeup.week4.Day15;
import java.util.Scanner;

public class Codeup1671 {
    public void rockPaperScissors(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("tie");
        } else if (num1 - num2 == -1 || num1 - num2 == 2) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Codeup1671 code = new Codeup1671();
        code.rockPaperScissors(num1, num2);
    }
}