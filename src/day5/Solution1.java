package day5;

import java.util.Arrays;

//전화번호 목록 https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Solution1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //phone_book: 전화목록

        //방법1> 정렬후 비교
        //정렬
        Arrays.sort(phone_book);

        //반복해서 앞번호가 뒷번호의 접두어로 시작하는지
        //시작값 startWith 혹은 substring 이용해서 추출하고 비교
        for(int i = 0; i<phone_book.length-1; i++){
//            if(phone_book[i+1].substring(0, phone_book[i].length()).equals(phone_book[i]))
            if(phone_book[i+1].startsWith((phone_book[i])))
                return false;
        }
        return answer;
    }
}
