package day1.array_compare;

import java.util.Comparator;

//Comparator 연습 예제
public class Coffee2 implements Comparator<Coffee2> {
    private final String name;
    private final int price;

    public Coffee2(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){return name;}
    public Integer getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Coffee{"+
                "name='"+name+'\''+
                ", price=" + price+
                '}';
    }

    @Override
    public int compare(Coffee2 o1, Coffee2 o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
