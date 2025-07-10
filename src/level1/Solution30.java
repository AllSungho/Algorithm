package level1;

class Solution30 {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0) {
            answer = ((Character) s.charAt(s.length()/2 - 1)).toString();
            answer += ((Character) s.charAt(s.length()/2)).toString();
        }
        else {
            answer = ((Character) s.charAt(s.length()/2)).toString();
        }
        return answer;
    }
}