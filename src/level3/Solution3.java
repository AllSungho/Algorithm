package level3;

class Solution3 {
    public int solution(String t, String p) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for(long i=0; i<t.length() + 1 - p.length(); i++){
            str.setLength(0);
            for(long j=i; j<p.length() + i; j++){
                str.append(t.charAt((int)j));
            }
            if(Long.parseLong(str.toString()) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}

