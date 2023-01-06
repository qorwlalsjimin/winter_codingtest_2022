package day2.quest;

import day3.quest.Solution1;

import java.util.Arrays;
import java.util.stream.IntStream;

// 체육복 https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Solution3 {
    public static int solution(int n, int[] lost, int[] reserve) {

        //방법> 배열을 이용한 방법으로 풀이

        //1> answer 기본 참여 인원을 구함==>참여수-lost
        int answer = n - lost.length;

        //2> lost, reserve 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //3> 도난 당한 학생들에게 체육복 빌려주는 경우
        //reserve에 있는 값은 lost 이전에 위치와 lost 다음 위치에 체육복을 빌려줄 수 있음
        for(int i = 0; i<lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                //여벌의 체육복을 가지고 있는 학생이 도난을 당한 경우
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1; //조건에 안 걸리도록 -1 대입
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                //여벌의 체육복이 없는 학생이 도난을 당해 체육복을 빌려주는 경우
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){ //앞이나 뒷번호에게 여유분이 있다면
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        int[] lost = new int[]{2, 4, 6};
        int[] reserve = new int[]{1,7};
        System.out.print(Solution3.solution(6, lost, reserve));
    }
}
