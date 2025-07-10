package level1;

import java.util.Arrays;

class Solution29 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        answer = Arrays.stream(arr).
                filter(num -> num > Arrays.stream(arr).min().getAsInt())
                .toArray();

        if(answer.length == 0){
            answer = new int[]{-1};
        }

        return answer;
    }
}
