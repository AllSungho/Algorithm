package level1;

import java.util.*;

public class Solution30 {
    public static void main(String[] args) {
        String s = "abcdef";
        String answer = "";
        if(s.length() % 2 == 0) {
            answer = ((Character) s.charAt(s.length()/2)).toString();
            answer += ((Character) s.charAt(s.length()/2 +1)).toString();
        }
        else {
            answer = ((Character) s.charAt(s.length()/2)).toString();
        }
        System.out.println(answer);
    }
}
