package com.likelion.codeup.week3.Day12;
import java.util.Scanner;

public class Codeup1620 {
    public int addDigits(int n) {
        int answer = 0;
        while (true) {
            answer += n%10;
            if (n<10) break;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Codeup1620 code = new Codeup1620();
        while (num > 9) {
            num = code.addDigits(num);
        }
        System.out.println(num);
    }
}