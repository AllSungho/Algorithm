package level3;

import java.util.*;

public class Solution6 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> hashMap = new HashMap<>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            str.append(s.charAt(i));
            if(Character.isDigit(s.charAt(i))) {
                answer.append(s.charAt(i));
                str.setLength(0);
                continue;
            }
            for(String j : hashMap.keySet()){
                if(str.toString().equals(j)){
                    answer.append(hashMap.get(j));
                    str.setLength(0);
                    break;
                }
            }
        }
    }
}
