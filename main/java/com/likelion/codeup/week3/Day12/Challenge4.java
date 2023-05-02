package com.likelion.codeup.week3.Day12;
// 자릿수 더하기: https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class Challenge4 {
    public int solution(int n) {
        int answer = 0;
        while (true) {
            answer += n%10;
            if (n<10)
                break;
            n /= 10;
        }
        return answer;
    }
}
