package day3.quest;

import java.util.Arrays;

// 구명보트
public class Solution1 {
    public static int solution(int[] people, int limit) {
        //people: 몸무게 목록
        //limit: 보트 제한 중량
        int answer = 0; //보트의 이동 횟수

        //*설명듣고 풀어본 내 풀이
        //30 50 50 70 80
        Arrays.sort(people);
        int first = 0;
        int last = people.length-1;

        while(first<=last) {
            if (people[first] + people[last] > limit) { //두 사람이 같이 못탈때
                last--; //한사람만 태워주고
                answer++; //배를 보낸다
            }else{
                //두 사람이 같이 탈 수 있을때
                first++; //몸무게가 적은 사람도 태워주고
                last--; //몸무게가 많은 사람도 태워준다
                answer++; //배를 보낸다
            }
        }

        //--★문제 풀이 이해하는 tip!★--
        //--first나 last가 움직이면 누군가가 배를 탔다는 의미이다
        //--아래와 같은 상황을 살펴보자
        //--
        //--0 1 2(first) 3 4 5(last) 6 7
        //--위와 같은 상황은 while문이 반복되고 있는 상황 중 하나이다
        //--숫자는 몸무게를 뜻하는 것이 아닌 index 번호를 뜻한다
        //--
        //--first는 2에 멈춰있고
        //--last는 5에 멈춰있다
        //--저 상황에서 0, 1, 6, 7은 이미 배를 탔고
        //--first와 last안에 있는 2, 3, 4, 5는 아직 배를 타지 못한 상황이다


//        //*선생님 풀이
//        //가장 가벼운 몸무게 저장할 변수(first)
//        int first = 0;
//
//        //가장 무거운 몸무게를 정할 변수(last)
//        int last = people.length-1;
//
//        //정렬 (sort() ==> 오름차순 정렬 ==> 작은 것부터)
//        Arrays.sort(people);
//
//        //가벼운 몸무게에서 가장 큰 몸무게의 합이 limit 범위에 들어가는 체크하고
//        // limit보다 작으면 first를 증가하면서
//        // limit보다 크면 last를 감소하면서 비교
//        while(first <= last){
//            answer++;
//            if(people[first]+people[last] <= limit)
//                first++;
//            last--;
//        }
        return answer;
    }
}


class Main{
    public static void main(String[] args) {
        int[] arr = new int[]{70, 50, 80, 50};
        System.out.print(Solution1.solution(arr,100));
    }
}
