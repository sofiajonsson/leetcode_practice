class Solution {
    public int[] plusOne(int[] digits) {
			int carry = 0;
				for(int i=digits.length-1; i>=0; i--){
				 //If digit is 9 then sum will result 1 to 0 with carry 1
					if(digits[i] == 9){
						carry = 1;
						digits[i] = 0;
				 	} else {
							digits[i] = digits[i] +1;
								return digits;
						}
				}
						 //If all digits are 9
				if(carry == 1){
					digits = new int[digits.length+1];
					digits[0] =1;
				}
			return digits;
		}
}
