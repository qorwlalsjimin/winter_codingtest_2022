package day2.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortEx {
    public static void main(String[] args) {

        //기본 자료형 정렬
        int[] intArray ={5,3,2,1,4};
        IntStream intStream = Arrays.stream(intArray);

        intStream
                .sorted()
                .forEach(n -> System.out.println(n));

        System.out.println("==================================");

        //클래스 정렬 ==> comparable
        List<Student> stuList = Arrays.asList(new Student("A", 33),new Student("B", 20),new Student("C", 55));

        stuList.stream().sorted().forEach(s -> System.out.println(s.getScore()+" "));
        System.out.println();


        //클래스 정렬 ==> comparator
        stuList.stream().sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore()));



    }
}
