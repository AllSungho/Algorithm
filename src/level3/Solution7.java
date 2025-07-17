package level3;

import java.util.Arrays;

public class Solution7 {
    public static void main(String[] args) {
        solution(new String[]{"abce", "abcd", "cdx"}, 2);

    }
    public static String[] solution(String[] strings, int n) {
        String[] answer = Arrays.stream(strings).sorted((a, b) -> {
            if(a.charAt(n)==b.charAt(n))
                return a.compareTo(b);
            return a.charAt(n)-b.charAt(n);
        }).toArray(size -> new String[size]);
        // toArray(String[]::new);

        return answer;
    }
}
