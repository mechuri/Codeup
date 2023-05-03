package com.likelion.codeup.week3.Day13;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = sc.nextInt();

//      무작위 출석 번호 입력 받기
        for (int i = 0 ; i < num ; i++) {
            list.add(sc.nextInt());
        }

//      가장 작은 출석 번호 출럭
        System.out.println(Collections.min(list));
    }
}