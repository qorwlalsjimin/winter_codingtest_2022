package day1.quest;

public class Solution7 {
    static int solution(int n){
        int answer = 0;
        answer = n%7==0 ? n/7 : n/7+1;
        return answer;
    }
};

/*
class Main{
    public static void main(String[] args) {
        System.out.print(Solution7.solution(15));
    }
}
*/
