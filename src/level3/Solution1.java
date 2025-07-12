package level3;

import java.lang.StringBuilder;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("how can i do it"));

    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Character[] result = new Character[s.length()];
        int space = 0;

        for(int i=0;i<s.length(); i++){
            result[i] = s.charAt(i);
            if(result[i] == ' '){
                space = 0;
                answer.append(' ');
                continue;
            }
            if(space % 2 == 0){
                result[i] = Character.toUpperCase(result[i]);
            }
            else {
                result[i] = Character.toLowerCase(result[i]);
            }
            answer.append(result[i]);
            space++;
        }
        return answer.toString();
    }
}
