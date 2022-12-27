package day2.quest;

import java.util.Arrays;

// 중복된 숫자 개수
public class Solution1 {
    public int solution(int[] array, int n) {
        int answer = 0;

        //1. for문 기반
         for(int item : array)
             if(item == n) answer++;

        //2. 필터 사용하기
        answer = (int)Arrays.stream(array)
                .filter(a -> a == n)
                .count();

        return answer;
    }
}

