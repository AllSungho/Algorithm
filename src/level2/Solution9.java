package level2;

import java.math.BigInteger;

public class Solution9 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        BigInteger firstValue = BigInteger.valueOf(n);
        BigInteger secondValue = BigInteger.valueOf(m);

        BigInteger value1 = firstValue.gcd(secondValue);

        answer[0] = value1.intValue();
        answer[1] = n*m/answer[0];

        return answer;
    }
}
