package level1;

import java.util.Arrays;

public class JustTestSolution {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,5,6,10};

        int[] answer = Arrays.stream(numbers).map(num -> num*2).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
