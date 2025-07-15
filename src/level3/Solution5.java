package level3;

public class Solution5 {
    public static void main(String[] args) {
        solution("zzzZZZ", 1);
    }
    public static String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))){
                if(s.charAt(i) + n > (int)'z'){
                    answer += (char)(s.charAt(i) + n - (int)'z'+ (int)'a' - 1);
                    continue;
                }
                answer += (char)(s.charAt(i) + n);
            }
            else if(Character.isUpperCase(s.charAt(i))){
                if(s.charAt(i) + n > (int)'Z'){
                    answer += (char)(s.charAt(i) + n - (int)'Z'+ (int)'A' - 1);
                    continue;
                }
                answer += (char)(s.charAt(i) + n);
            }
            else{
                answer += s.charAt(i);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
