package com.likelion.codeup.week3.Day12;
import java.util.ArrayList;
import java.util.Collections;
// 수열과 구간 쿼리 2: https://school.programmers.co.kr/learn/courses/30/lessons/181923

class Challenge2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];

        for (int i = 0 ; i < queries.length ; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = queries[i][0] ; j <= queries[i][1] ; j++) {
                if (arr[j] > queries[i][2]) {
                    temp.add(arr[j]);
                }
            }
            if (temp.size()>0)
                answer[i] =  Collections.min(temp);
            else
                answer[i] = -1;
        }
        return answer;
    }
}