package level1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JustTestSolution {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,5,6,10};

        int[] answer = Arrays.stream(numbers).map(num -> num*2).toArray();
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        JustTestSolution a = new JustTestSolution();


        System.out.println(Arrays.toString(answer));
    }

}
