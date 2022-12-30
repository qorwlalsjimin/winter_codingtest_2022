package day5;

//위장 https://school.programmers.co.kr/learn/courses/30/lessons/43105
public class Solution3 {
    public int solution(int[][] triangle) {
        //triagle: 삼각형
        int answer = 0;

//        //1> 별도의 저장 공간을 따로 만들어서 사용
//        int[][] dp = new int[5][6];
//
//        dp[0][1] = triangle[0][0]; //첫번째값
//
//        //2> dp 테이블의 초기값으로 왼쪽과 오른쪽을 더해서 설정
//        //계산은 현재값과 왼쪽(dp[i-1][j]), 오른쪽(dp[i-1][j-1])
//
//        for(int i = 1; i<dp.length; i++){
//            for(int j = 1; j<dp[i].length; j++){
//                int left = 0; int right = 0;
//                left = dp[i-1][j-1];
//                right = dp[i-1][j];
//                dp[i][j] = left>right ? left : right;
//            }
//        }
//        for(int i = 0; i<dp.length; i++){
//            for (int j = 0; j < dp[i].length; j++)
//                System.out.print(dp[i][j]+" ");
//            System.out.println();
//        }

        //1> 별도의 저장 공간을 따로 만들어서 사용
        int[][] dp = new int[triangle.length][triangle.length];
        int max = 0;

        dp[0][0] = triangle[0][0]; //첫번째값

        //2> dp 테이블의 초기값으로 왼쪽과 오른쪽을 더해서 설정
        //계산은 현재값과 왼쪽(dp[i-1][j]), 오른쪽(dp[i-1][j-1])

        //가장 왼쪽과 오른쪽 줄의 dp 계산
        for(int i = 1; i<triangle.length; i++){
            dp[i][0] = dp[i-1][0] + triangle[i][0]; //dp[1,0] = dp[0,0] + triangle[1,0] => 7+3
            dp[i][i] = dp[i-1][i-1] + triangle[i][i]; //dp[1,1] = dp[0,0] + triangle[1,1] = 7+8
        }

        //세번째줄부터
        for(int i = 2; i<triangle.length; i++){
            for(int j = 1; j<i; j++){
                dp[i][j] = Math.max(dp[i-1][j-1] + triangle[i][j], dp[i-1][j]+triangle[i][j]);
                //대각선과 계산, 위에 값 계산 중 큰것
            }
        }

        //3> 맨 마지막 줄의 제일 큰 수 찾기
        for(int x : dp[dp.length-1]){
            if(x > max) max = x;
        }
        answer = max;
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[][] t = new int[][]{
                {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}
        };
        s.solution(t);
    }
}