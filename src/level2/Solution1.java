package level2;

class Solution1 {
    public String solution(int n) {
        String answer = "";
        int waterMelon = n / 2;
        int su = n % 2;

        for(int i = 0; i < waterMelon; i++){
            answer = answer.concat("수박");
        }
        if(su != 0){
            answer = answer.concat("수");
        }

        return answer;
    }
}
