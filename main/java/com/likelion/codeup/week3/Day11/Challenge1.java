package com.likelion.codeup.week3.Day11;
// 주사위 게임 2: https://school.programmers.co.kr/learn/courses/30/lessons/181930

class Challenge1 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a==b && b==c && c==a) {
            answer =  (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        else if (a!=b && b!=c && c!=a) {
            answer = (a + b + c);
        }
        else {
            answer = (a + b + c) * (a*a + b*b + c*c);
        }
        return answer;
    }
}
