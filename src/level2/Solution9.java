package level2;

import java.math.BigInteger;

public class Solution9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 12;
        BigInteger firstValue = BigInteger.valueOf(a);
        BigInteger secondValue = BigInteger.valueOf(b);

        BigInteger value1 = firstValue.gcd(secondValue);

        System.out.println((a*b)/value1.intValue());

    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        BigInteger firstValue = BigInteger.valueOf(n);
        BigInteger seocndValue = BigInteger.valueOf(m);

        BigInteger value1 = firstValue.gcd(secondValue);

        answer[0] = value1.intValue();
        answer[1] = n*m/answer[0];

        return answer;
    }
}
