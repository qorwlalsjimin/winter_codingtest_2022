package day4;

import java.util.Arrays;

//완주하지 못한 선수 https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Solution5 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //방법1> 정렬후에 반복하면서 비교
        //1) 두배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2) 두배열의 값의 차이를 찾음
        int index;
        for(index = 0; index<completion.length; index++){
            if(!participant[index].equals(completion[index])){
                answer = participant[index];
                break;
            }
        }

        //3) 마지막 주자가 완주를 못했을 경우
        if(index == completion.length){
            answer = participant[index];
        }

        return answer;
    }
}
