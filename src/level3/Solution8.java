package level3;

import java.util.Arrays;

public class Solution8 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] copy = array.clone();
            Arrays.sort(copy, commands[i][0] - 1, commands[i][1]);
            answer[i] = copy[commands[i][2] + commands[i][0] - 2];
        }
    }
}
