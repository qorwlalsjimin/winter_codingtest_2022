package day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//숫자 게임
public class Solution4 {
    public int solution(int[] A, int[] B) {
        int answer = -1;
        //A: 첫번째 팀 ==> 출전 순서를 정해서 공개
        //B: 두번째 팀 ==> B팀의 승점 갯수
        //==>A팀을 보고 B팀의 최종 승점을 가장 많이 올릴 수 있는 순서를 정함
        //A의 i번쨰 원소가 B팀의 i번째 팀원이 부여 받은 수

        //[5,1,3,7]	[2,2,6,8]
        //2 2 6 8

        //방법1> a팀은 그대로, b팀은 정렬한 후 이중 for문으로 접근

//        //A를 이길 수 있는 B 찾기 ==> 이중 for
//        Arrays.sort(B); //오름차순 정렬
//
//        for(int i = 0; i<A.length; i++){
//            for(int j = 0; j<B.length; j++){
//                if(A[i] < B[j]){
//                    answer++;
//                    B[j]=0;
//                    break;
//                }
//            }
//        }


        //방법2> a팀과 b팀을 정렬한 후 A의 뒤에서부터 반복하면서 A와 B 비교
        Arrays.sort(A);
        Arrays.sort(B);

        int index = B.length-1;
        for(int i = A.length-1; i>=0; i--){
            if(A[i] < B[index]){
                index--;
                answer++; //1357  2268
            }
        }


        // 내가 푼 방법>
//        Arrays.sort(A);
//        Arrays.sort(B);
//
//        List<Integer> Blist =
//                Arrays.stream(B)
//                        .boxed()
//                        .collect(Collectors.toList());
//
//        for(int Aitem : A){
//            for(int i = 0; i<Blist.size(); i++){
//                if(Aitem < Blist.get(i)){
//                    answer++;
//                    Blist.remove(i);
//                    break;
//                }
//            }
//        }

        return answer;
    }
}
