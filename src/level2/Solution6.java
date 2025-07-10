package level2;

class Solution6 {
    public boolean solution(String s) {
        if (s.length()==4 || s.length()==6){
            for(int i=0;i<s.length();i++){
                if(!Character.isDigit(s.charAt(i)))
                    return false;
            }
        }
        else{
            return false;
        }
        return true;
    }
}