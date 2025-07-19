package level3;

import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));

    }
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0;i<s.length(); i++){
            answer[i] = -1;
            for(int j=i-1; j>=0; j--){
                if(s.charAt(j) == s.charAt(i)){
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}
