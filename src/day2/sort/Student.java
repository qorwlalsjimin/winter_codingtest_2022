package day2.sort;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    //생성자
    Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    //getter setter
    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
