package level3;

class Solution15 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0, z = 0;

        while(true){
            if(z >= goal.length) return "Yes";
            else if(i < cards1.length && cards1[i].equals(goal[z])){
                i++;
                z++;
            }
            else if(j < cards2.length && cards2[j].equals(goal[z])){
                j++;
                z++;
            }
            else return "No";
        }
    }
}
