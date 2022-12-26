package day1.array_compare;

import java.util.Arrays;

public class CoffeeMain2 {
    public static void main(String[] args) {
        Coffee2[] coffees = new Coffee2[]{
                new Coffee2("Americano", 3500),
                new Coffee2("Green tea Latte", 5500),
                new Coffee2("Vanilla Latte", 4500),
                new Coffee2("Espresso", 3000)
        };

        Arrays.sort(coffees);//오름차순
        for(Coffee2 coffee : coffees)
            System.out.println(coffee.toString());
    }
}
