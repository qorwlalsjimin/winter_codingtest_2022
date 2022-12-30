package day5;

import java.util.Stack;

//올바른 괄호의 개수 https://campus.programmers.co.kr/tryouts/38022/challenges
class P{
    int open, close;
    P(int open, int close){
        this.open = open;
        this.close = close;
    }

}
public class Solution4 {
    int answer = 0;

    public int solution(int n) {
        //깊이 우선 탐색

        //1> 스택이용
        int answer = 0;
        Stack<P> stack = new Stack<>();
        stack.push(new P(0,0));
        while(!stack.isEmpty()){
            P p = stack.pop();
            if(p.open > n) continue;
            if(p.open < p.close) continue;
            if(p.open+p.close == 2*n) {
                answer++;
                continue;
            }
            stack.push(new P(p.open+1, p.close)); //여는 괄호
            stack.push(new P(p.open, p.close+1)); //닫는 괄호
        }

        //2>dfs메서드 (재귀함수)
        //방법1> 재귀함수 사용
        dfs(0,0,n);
        //dfs(여는 괄호, 닫는 괄호, 갯수)
        return answer;
    }

    public void dfs(int open, int close, int n){
        if(open > n || close > n || close > open){
            return;
        }
        if(open == n && close == n){
            answer++;
            return;
        }
        dfs(open+1, close, n);
        dfs(open, close+1, n);

//        open = 0, close=0 ==> dfs 호출
//        open=1, close=0, 2==> 1,0
//
//
    }

}
