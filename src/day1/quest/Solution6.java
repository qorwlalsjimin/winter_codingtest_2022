package day1.quest;

public class Solution6 {
    static int solution(int n){
        int answer = 0;
        for(int i = 1; i<=n; i++)
            if(i%2==0) answer += i;
        return answer;
    }
};

/*
class Main{
    public static void main(String[] args) {
        System.out.print(Solution4.solution(23));
    }
}*/
