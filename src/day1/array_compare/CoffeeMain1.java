package day1.array_compare;

import java.util.Arrays;
import java.util.Comparator;

public class CoffeeMain1 {
    public static void main(String[] args) {
        Coffee1[] coffees = new Coffee1[]{
                new Coffee1("Americano", 3500),
                new Coffee1("Green tea Latte", 5500),
                new Coffee1("Vanilla Latte", 4500),
                new Coffee1("Espresso", 3000)
        };

        Arrays.sort(coffees, new Comparator<Coffee1>() {
            @Override
            public int compare(Coffee1 o1, Coffee1 o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
                //같으면: 0
                //오른쪽이 크면: 음수
                //왼쪽이 크면: 양수
                //equal 메서드와 compareTo 메서드를 오버라이딩하지 않아도 사용이 가능하므로 코드가 간결해진다
                //두가지 방법이 있다
            }
        });//오름차순
        
        for(Coffee1 coffee : coffees)
            System.out.println(coffee.toString());
    }
}
