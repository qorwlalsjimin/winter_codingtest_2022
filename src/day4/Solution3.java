package day4;

import java.util.Arrays;

//입국 심사 https://school.programmers.co.kr/learn/courses/30/lessons/43238
public class Solution3 {
    public long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);

        long left = 1;
        long right = (long)times[times.length-1]*n;

        //최소와 최대 비교
        while(left <= right){
            //중간값
            long mid = (left+right)/2;
            long sum = 0; //심사하는 인원
            for(int i = 0; i<times.length; i++){
                sum += mid/times[i]; //mid값에 심사하는 시간을 나누어서 sum에 저장
            }
            //ex) times: 7, 10, n=6
            //left: 1, right: 10*6 ==> 60, mid = 61/2 ==> 30.5
            //sum => 30.5/7 => 4, 30.5/10 => 3. 총 7 ==> mid 시간동안 몇명을 심사할 수 있는지
            //mid로 정해놓은 시간내에 n이 모두 심사를 받을 수 있는가를 체크

            if(sum<n){ //심사를 해야할 인원이 더 크면
                left = mid + 1;
            }else{ //인원수보다 시간이 더 클때
                right = mid - 1;
                answer = mid; //가장 상한값
            }
        }
        return answer;
    }
}
