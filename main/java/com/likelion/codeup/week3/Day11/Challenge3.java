package com.likelion.codeup.week3.Day11;
// 수열과 구간 쿼리 3: https://school.programmers.co.kr/learn/courses/30/lessons/181924

class Challenge3 {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        for (int i = 0 ; i < queries.length ; i++) {
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}