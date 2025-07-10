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
}