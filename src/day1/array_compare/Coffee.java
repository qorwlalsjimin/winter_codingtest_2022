package day1.array_compare;

//Comparable 연습 예제
public class Coffee implements Comparable {
    private final String name;
    private final int price;

    public Coffee(String name, int price){
        this.name = name;
        this.price = price;
    }

    public Integer getPriceAsInteger(){
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Coffee) obj).getPriceAsInteger().equals(getPriceAsInteger());
    }

    //가격 비교
    @Override
    public int compareTo(Object o) {
        Coffee e = (Coffee) o;

        //기존값.새롭게 들어온 값
        return getPriceAsInteger().compareTo(e.getPriceAsInteger());
        //값이 같으면 0, 값이 적으면 -1(음수), 값이 크면 1(양수)로 리턴
    }

    @Override
    public String toString() {
        return "Coffee{"+
                "name='"+name+'\''+
                ", price=" + price+
                '}';
    }
}
