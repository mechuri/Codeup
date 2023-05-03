package com.likelion.codeup.week3.Day13;
import java.util.ArrayList;

class Challenge1 {
    public int[] solution(int n) {
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisor.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        int[] answer = new int[divisor.size()];
        for (int j = 0; j < divisor.size(); j++)
            answer[j] = divisor.get(j).intValue();

        return answer;
    }
}