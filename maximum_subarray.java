class Solution {
    public int maxSubArray(int[] nums) {
        		boolean allNegative = true;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=0){
				allNegative=false;
				break;
			}
		}
		if(!allNegative){
			int max = 0;
			int sum = 0;
			for(int i=0;i<nums.length;i++){
				sum += nums[i];
				if(sum<0){
					sum=0;
					continue;
				}
				if(sum>max)
					max = sum;
			}
			return Math.max(sum,max);
		}
		else{
			int max = nums[0];
			for(int i=1;i<nums.length;i++){
				if(max<nums[i])
					max = nums[i];
			}
			return max;
		}
  }
}

class Solution {
    public int maxSubArray(int[] nums) {
       int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int x : nums) {
            if(sum < 0) sum = 0;
            sum += x;
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
