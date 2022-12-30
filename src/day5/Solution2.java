package day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//위장 https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Solution2 {
    public int solution(String[][] clothes) {
        //clothes: 여러 개의 옷 목록과 종류가 있는 2차원 배열
        // 행(옷 목록), 열(종류)
        int answer = 1;

        //1> 배열로 들어온 것을 HashMap으로 분류
        // key: 종류, value: 종류별 옷 목록 갯수
        HashMap<String, Integer> map = new HashMap<>(clothes.length);

        //2> 배열을 Map 테이블로 만들기
        for(String c[] : clothes) {
            String type = c[1]; //종류를 type에 설정
            map.put(type, map.getOrDefault(type, 0)+1);
        }

        //3> 모두 조합하기
        //map에 저장된 값들을 참조할 반복자 선언
        Iterator<Integer> iterator = map.values().iterator();

        while(iterator.hasNext()){
            answer *= iterator.next().intValue()+1;
            //모든 종류의 옷을 서로 곱해서 경우의 수를 구함
            //3*2 ==>6 -1
        }

        //none(어떤종류)의 옷도 입지 않은 경우
        return answer -1;
    }
}
