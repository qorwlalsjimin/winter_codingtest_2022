package day1.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "김자바");

        //iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        //stream - 컬렉션에서부터 리소스 얻기
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
