package day2.optional;

import java.util.ArrayList;
import java.util.List;

public class OptionalEx {
    public static void main(String[] args) {
        //최종 결과물의 디폴트값
//        List<Integer> list = new ArrayList<>();
//        double avg = list.stream()
//                .mapToInt(Integer :: intValue)
//                .average()
//                .getAsDouble(); //값이 없어서 오류

        List<Integer> list = new ArrayList<>();
        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);

        System.out.println("결과:" + avg);


        list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .ifPresent(a -> System.out.println("평균: "+a));
    }
}
