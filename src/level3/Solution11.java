package level3;

import java.lang.StringBuilder;

class Solution11 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                str.append(i);
            }
        }
        answer.append(str);
        answer.append(str.reverse());
        answer.insert(answer.length()/2, 0);

        return answer.toString();
    }
}