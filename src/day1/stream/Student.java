package day1.stream;

public class Student {
    private String name;
    private int score;

    //매개변수 생성자
    Student(String name, int score){
        super();
        this.name = name;
        this.score = score;
    }

    //getter 생성자
    String getName(){
        return name;
    }

    int getScore(){
        return score;
    }
}
