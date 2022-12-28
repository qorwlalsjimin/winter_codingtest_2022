package day3.quest;

// 기지국 설치
public class Solution2 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        //n: 아파트 동갯수
        //stations: 기지국이 설치된 위치
        //w: 전파 범위

        //배열로 접근
        //배열에 접근할 수 있는 인덱스 번호
        int index = 0;

        //현재 기지국이 설치된 값을 체크할 변수
        int position = 1; //순회 시작 위치

        //현재 위치에서 아파트 동을 반복하면서
        while(position <= n){
            //1> 기존에 기지국이 설치가 되어 있는 경우 => 전파를 받을 수 있는 아파트 최소 범위
                        

            //2> 새롭게 설치하는 경우

        }



        return answer;
    }
}

/*
class Main{
    public static void main(String[] args) {
        int[] arr = new int[]{70, 50, 80, 50};
        System.out.print(Solution1.solution(arr,100));
    }
}
*/
