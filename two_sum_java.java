class TwoSum {

    // Time complexity: O(n^2)
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


class TwoSum {

    // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumNumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (twoSumNumMap.containsKey(complement)) {
                return new int[] { twoSumNumMap.get(complement), i };
            } else {
                twoSumNumMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}

class TwoSum {

    // Time complexity: O(n*log(n))
    // returns values not the indices
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
