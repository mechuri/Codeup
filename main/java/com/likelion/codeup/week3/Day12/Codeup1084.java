package com.likelion.codeup.week3.Day12;
import java.util.Scanner;
import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int color1 = sc.nextInt();
        int color2 = sc.nextInt();
        int color3 = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0 ; i < color1 ; i ++) {
            for (int j = 0 ; j < color2 ; j ++) {
                String print = "";
                for (int k = 0 ; k < color3 ; k++) {
                    print += i + " " + j + " " + k + "\n";
                }
                bw.write(print);
                bw.flush();
            }
        }
        System.out.println(color1*color2*color3);
    }
}