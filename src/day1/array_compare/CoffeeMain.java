package day1.array_compare;

import java.util.Arrays;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee[] coffees = new Coffee[]{
                new Coffee("Americano", 3500),
                new Coffee("Green tea Latte", 5500),
                new Coffee("Vanilla Latte", 4500),
                new Coffee("Espresso", 3000),
                new Coffee("ㅇㅇㅇspresso", 1000)
        };

        Arrays.sort(coffees);//오름차순
        for(Coffee coffee : coffees)
            System.out.println(coffee.toString());
    }
}
