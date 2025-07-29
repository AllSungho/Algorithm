package level3;

import java.util.Arrays;

class Solution17 {
    public static int[] solution(int[] answers) {
        int[] count = {0, 0, 0};
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int one = 0, two = 0, three = 0;
        int same = 0;
        for(int i : answers){
            if(one >= num1.length)
                one = 0;
            if(two >= num2.length)
                two = 0;
            if(three >= num3.length)
                three = 0;
            if(i == num1[one])
                count[0]++;
            if(i == num2[two])
                count[1]++;
            if(i == num3[three])
                count[2]++;
            one++;
            two++;
            three++;
        }

        for(int i = 0; i < 3; i++){
            if(count[i] == Arrays.stream(count).max().getAsInt())
                same++;
        }
        int[] answer = new int[same];
        int j = 0;
        for(int i = 0; i < 3; i++){
            if(count[i] == Arrays.stream(count).max().getAsInt()){
                answer[j] = i + 1;
                j++;
            }
        }

        return answer;
    }
}