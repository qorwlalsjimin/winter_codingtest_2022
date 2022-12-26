package day1.quest;

import java.util.Arrays;

//방법 1: 조건문 이용
//방법 2: Arrays 클래스 이용
    //sort() 오름차순 정렬
    //가장 오른쪽에 있는 두개의 값 곱하기
public class Solution8 {
    static int solution(int[] numbers){
        int answer = 0;
        //방법 1:
/*        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                if(answer < numbers[i]*numbers[j])
                    answer = numbers[i]*numbers[j];
            }
        }*/

        //방법 2:
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];

        return answer;
    }
};


class Main{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Solution8.solution(arr) );
    }
}

