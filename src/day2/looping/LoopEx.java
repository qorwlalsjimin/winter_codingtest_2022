package day2.looping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopEx {
    public static void main(String[] args) {
        int[] intArray = {23,22,11,8,4};
        IntStream intStream = Arrays.stream(intArray);

        intStream.filter(a -> a%2==0).peek(n -> System.out.println(n)).sum();

        System.out.println("------------------------");

        intStream = Arrays.stream(intArray);
        intStream.filter(a -> a%2==1).forEach(n -> System.out.println(n));

    }
}
