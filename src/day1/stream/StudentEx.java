package day1.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentEx {
    public static int sum = 0;

    public static void main(String[] args) {

        //컬렉션으로 스트림 얻기
        List<Student> studentList=
                Arrays.asList(
                        new Student("홍길동", 10),
                        new Student("신용권", 20)
                );

        //  반복자 (Iterator)
        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //  스트림 (stream)
        Stream<Student> stream = studentList.stream();
        stream.forEach( s -> System.out.println(s.getName()) );
        System.out.println("-----------------------");

        //배열로 스트림 얻기
        String[] strArray = {"백지민", "홍길동", "신용권"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.println(a));
        System.out.println("-----------------------");

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.print(a*2 + ", ") );
        System.out.println("-----------------------");


        //숫자 범위로 스트림 얻기
        IntStream rangeStream = IntStream.rangeClosed(1, 100);
        rangeStream.forEach(a -> {
            sum +=a;
            System.out.println("총합: "+ sum);
        });
    }
}
