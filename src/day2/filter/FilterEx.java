package day2.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

        names.stream() // 오리지널 스트림
                .distinct() // 중간처리 ==> 중복제거
                .forEach(n -> System.out.println(n)); // 최종처리

        System.out.println("============================");

        names.stream() // 오리지널 스트림
                .filter(n -> n.startsWith("신")) // 중간처리 ==> 필터
                .forEach(e -> System.out.println(e)); // 최종처리

        System.out.println("============================");

        names.stream() // 오리지널 스트림
                .distinct() // 중간처리 ==> 중복제거 + 필터
                .filter(n -> n.startsWith("신")) // 중간처리
                .forEach((e) -> System.out.println(e)); // 최종처리

        //응용해서 약수 구하기 문제 풀어봄
        IntStream stream = IntStream.rangeClosed(1, 24);
        stream.filter(i -> 24%i ==0).toArray();
    }

}
