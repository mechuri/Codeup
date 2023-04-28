package com.likelion.codeup.week2.Day10;
import java.util.Collections;
import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/138477

class Challenge3 {
    public int[] solution(int k, int[] score) {
        int answer[] = new int[score.length];
        ArrayList<Integer> hof = new ArrayList<Integer>();

        for (int i = 0 ; i < score.length ; i++) {
            hof.add(score[i]);
            if (hof.size() > k) {
                int min = Collections.min(hof);
                hof.remove(Integer.valueOf(min));
            }
            answer[i] = Collections.min(hof);
        }
        return answer;
    }
}