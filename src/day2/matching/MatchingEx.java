package day2.matching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingEx {
    public static void main(String[] args) {
        //매칭
        int[] intArray1 = {2,4,6};
        boolean result = Arrays.stream(intArray1).allMatch(a -> a%3==0); //모두 만족
        System.out.println("결과: "+result);

        result = Arrays.stream(intArray1).anyMatch(a-> a%3==0); //하나 이상 만족
        System.out.println("결과: "+result);

    }
}
