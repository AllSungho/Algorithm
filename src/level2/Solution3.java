package level2;

class Solution3 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int num = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    num++;
                }
            }
            if(num%2 == 0){
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        return answer;
    }
}
