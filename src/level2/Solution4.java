package level2;

import java.util.*;
import java.util.stream.Collectors;

class Solution4 {
    public String solution(String s) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        list = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        for(char c : list){
            stringBuilder.append(c);
        }

        answer = stringBuilder.toString();

        return answer;
    }
    public String solution2(String s){
        String answer = "";
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        answer = list.stream().sorted(Collections.reverseOrder()).map(ch -> ch.toString()).collect(Collectors.joining());

        return answer;
    }
}