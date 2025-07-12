package level2;

import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.Integer;

class Solution10 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
    public static int solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        while(n != 0){
            stringBuilder.append(n % 3);
            n /= 3;
        }
        return Integer.parseInt(stringBuilder.toString(), 3);
    }
}