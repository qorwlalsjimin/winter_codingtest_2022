package day2.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        //asDoubleStream
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream() //double형으로 변환
                .forEach(d->System.out.println(d)); //최종출력


        //boxed
        intStream = Arrays.stream(intArray);
        intStream.boxed() //기본형 자료형 -> 랩퍼 오브젝트형으로
                .forEach(obj -> System.out.println(obj.intValue()));


        //flapMap
        List<String> inputList = Arrays.asList("java lamde", "stream mapping");
        inputList.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word->System.out.println(word));
    }
}
