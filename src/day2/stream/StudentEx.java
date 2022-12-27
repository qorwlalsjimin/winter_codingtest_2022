package day2.stream;

import java.util.Arrays;
import java.util.List;

public class StudentEx {
    public static void main(String args[]) {

        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20));

        double avg = studentList.stream() // 오리지널 스트림
                .mapToInt(Student :: getScore) // 중간 처리
                .average() // 최종처리
                .getAsDouble();

        System.out.println("평균 : " +avg);

    }

}
