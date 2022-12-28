package day2.quest;

import java.util.Arrays;

// 머쓱이보다 키 큰 사람
public class Solution2 {
    public int solution(int[] array, int height) {
        int answer = 0;

        //1. for문 기반
        for(int item : array)
            if(item > height) answer++;

        //2. 필터 사용하기
        answer = (int)Arrays.stream(array)
                .filter(n -> n>height)
                .count();

        return answer;
    }
}

