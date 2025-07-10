package level2;

class Solution5 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long needMoney = 0;
        for(int i=1; i<=count; i++){
            needMoney += price*i;
        }

        if(needMoney > money)
            answer = needMoney-money;
        else
            return 0;

        return answer;
    }
}
