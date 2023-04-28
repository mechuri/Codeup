package com.likelion.codeup.week2.Day10;
//https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Challenge1 {
    public int solution(long num) {
        int answer = 0;
        while(num != 1) {
            num = num % 2 == 0 ? (num / 2) : (num * 3 + 1);
            answer += 1;
            if (answer == 500)
                return -1;
        }
        return answer;
    }
}