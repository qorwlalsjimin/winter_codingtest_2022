package day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//숫자 게임 직접 풀어보기
public class Solution4 {
    public int solution(int[] A, int[] B) {
        int answer = -1;
        //A: 첫번째 팀
        //B: 두번째 팀 ==> B팀의 승점 갯수

        //[5,1,3,7]	[2,2,6,8]
        //1 3 5 7
        //2 2 6 8

        Arrays.sort(A);
        Arrays.sort(B);

        List<Integer> Blist =
                Arrays.stream(B)
                        .boxed()
                        .collect(Collectors.toList());

        for(int Aitem : A){
            for(int i = 0; i<Blist.size(); i++){
                if(Aitem < Blist.get(i)){
                    answer++;
                    Blist.remove(i);
                    break;
                }
            }
        }

        return answer;
    }
}
