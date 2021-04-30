class Solution {
    public int romanToInt(String s) {
          int nums[] = new int[s.length()];
	    for(int i = 0; i < s.length(); i++){
	        switch (s.charAt(i)) {
	            case 'M':
	                nums[i] = 1000;
	                break;
	            case 'D':
	                nums[i] = 500;
	                break;
	            case 'C':
	                nums[i] = 100;
	                break;
	            case 'L':
	                nums[i] = 50;
	                break;
	            case 'X' :
	                nums[i] = 10;
	                break;
	            case 'V':
	                nums[i] = 5;
	                break;
	            case 'I':
	                nums[i] = 1;
	                break;
	        }
	    }

	    int sum = 0;
	    for(int i=0; i<nums.length-1; i++){
	        if(nums[i] < nums[i+1])
	            sum -= nums[i];
	        else
	            sum += nums[i];
	    }

	    return sum + nums[nums.length-1];
    }
}
//
//  Numbers increase in a roman numeral notation from right to left,
//  any subtractive number must also be smaller than the current ans.
//
// Are able to avoid the need for an extra variable but run into the
// issue of repeated numerals resulting in an issue (ex, "III")
// This is mitigated by multiplying num by any number between 2 and 4 before comparing it to ans
// since the numerals jump in value by increments of at least 5x.
//
// Once we can identify a subtractive numeral, we just iterate backwards through S to find and return the ans.

class Solution {
    public int romanToInt(String s) {
          int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}
