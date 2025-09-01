package level3;

class Solution18 {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if(isPrime(sum))
                        answer++;

                }
            }
        }
        return answer;
    }

    public boolean isPrime(int sum) {
        for(int z = 2; z <= Math.sqrt(sum); z++) {
            if(sum % z == 0) {
                return false;
            }
        }
        return true;
    }
}
