package day1.array_compare;

//Comparator 연습 예제
public class Coffee1{
    private final String name;
    private final int price;

    public Coffee1(String name, int price){
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
}
