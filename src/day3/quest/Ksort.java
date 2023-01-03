package day3.quest;

import java.util.Arrays;

//k번째수 https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Ksort {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;

        //* 내 풀이
        for(int i = 0; i<commands.length; i++){
            int[] array_new = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(array_new);
            answer[index++] = array_new[commands[i][2]-1];
        }

        //* 선생님 풀이
        //1) 값 뽑아내기
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작값
            int end = commands[i][1];   // 끝값
            int k = commands[i][2]; // 순위에 해당하는 값

            int[] tmp = new int[end - start + 1];  //추출
            int a = 0;
            for (int j = start - 1; j < end; j++) {
                tmp[a++] = array[i];
            }
            // Arrays=> copyofRange(배열, 시작, 끝)

        // 2) 정렬
            Arrays.sort(tmp);

        // 3) k번째 값 구하기
            answer[index++] = tmp[k - 1];
        }

        return answer;
    }
}

class Main {
    public static void main(String args[]) {

        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Ksort.solution(array, commands);

    }
}