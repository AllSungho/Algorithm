package level1;

class Solution8 {
    public int solution(int angle) {
        if(angle<90)
            return 1;
        else if(angle==90)
            return 2;
        else if(angle<180)
            return 3;
        return 4;
    }
}
