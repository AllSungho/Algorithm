package level3;

import java.util.Arrays;

class Solution16 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = 0; i < score.length/m; i++){
            answer += score[m*i + score.length%m] * m;
        }

        return answer;
    }
}
