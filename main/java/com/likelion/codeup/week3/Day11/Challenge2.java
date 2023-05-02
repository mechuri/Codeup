package com.likelion.codeup.week3.Day11;
// 이어 붙인 수: https://school.programmers.co.kr/learn/courses/30/lessons/181928

class Challenge2 {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for (int i = 0 ; i < num_list.length ; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            }
            else {
                odd += Integer.toString(num_list[i]);
            }
        }
        return Integer.parseInt(odd)+Integer.parseInt(even);
    }
}