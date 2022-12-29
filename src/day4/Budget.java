package day4;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

//예산 https://campus.programmers.co.kr/tryouts/38018/challenges
public class Budget {
    public int solution(int[] budgets, int M) {
        int answer = 0;

        //[110, 120, 140, 150]	485 => 127

        //budget: 예산 신청
        //M: 총 예산
        //최대값

//        Arrays.sort(budgets);
//        int sum = 0;
//        for(int item : budgets)
//            sum += item;
//        int middle = sum/budgets.length; //121
//
//        //1. 전체 예산 - 중앙값보다 안 큰 예산들의 합
//        //2. 1.의 결과 / 중앙값보다 큰 예산들의 개수
//
//        int tinysum = 0;
//        int cnt = 0;
//        for(int item : budgets) {
//            if (item < middle) tinysum += item;
//            else cnt++;
//        }
//
//        answer = (sum - tinysum)/cnt;

// ---------------------------------------------

//        //최소값
//        int min = 0;
//
//        //최대값
//        int max = 0;
//
//        Arrays.sort(budgets); //정렬이 for문보다 더 효율이 좋다
//        max = budgets[budgets.length-1];

        //혹은
//        for(int b : budgets)
//            if(b>max) max = b;

        //최대값과 최소값 비교(이진탐색)
//        while(min <= max){
//            int mid = (min + max)/2;
//            int sum = 0;
//
//            for(int b : budgets)
//                sum += (b > mid) ? mid : b; //신청한 예산이 상한액보다 크면 mid 아니면 b
//
//            //총합계 금액과 총예산 비교
//            if(sum <= M) {
//                min = mid + 1; //최저값을 재조정
//                answer = mid;
//            }else{
//                max = mid - 1;
//            }
//        }

        // -----------------------------

        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);

        while(min <= max){
            int mid = (min+max)/2; //중앙값 구하기
            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid)) //b와 mid중 더 작은 숫자를 반환
                    .sum();

            //            //총합계 금액과 총예산 비교
            if(sum <= M) {
                min = mid + 1; //최저값을 재조정
                answer = mid;
            }else{
                max = mid - 1;
            }
        }

        //중앙값 구하기

        //합계 구하기

        //합계가 총 예산에 안 벗어나는지 확인하고 결과 리턴

        return answer;
    }


}
