package level3;

import java.util.Arrays;
import java.util.Collections;

public class Solution13 {
    public static void main(String[] args) {
        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Integer[] sample = new Integer[score.length];
        for(int i=0;i<score.length;i++){
            sample[i] = 0;
        }
        for(int i=0;i<score.length; i++){
            sample[i] = score[i];
            Arrays.sort(sample, Collections.reverseOrder());
            if(i>=k) answer[i]=sample[k-1];
            else answer[i]=sample[i];
        }

        return answer;
    }
}
