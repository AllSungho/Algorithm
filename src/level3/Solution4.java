package level3;

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(sizes);

    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<sizes.length;i++){
            list.add(Arrays.stream(sizes[i]).max().getAsInt());
        }
        answer = list.stream().mapToInt(num -> num).max().getAsInt();
        list.clear();
        for(int i=0;i<sizes.length;i++){
            list.add(Arrays.stream(sizes[i]).min().getAsInt());
        }
        answer *= list.stream().mapToInt(num -> num).max().getAsInt();
        return answer;
    }
}
