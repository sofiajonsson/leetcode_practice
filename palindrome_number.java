class Solution {
    public boolean isPalindrome(int x) {
    if (x < 0)
			return false;

		// initialize how many zeros
		int div = 1;
		while (x / div >= 10) {
			div *= 10;
		}

		while (x != 0) {
			int left = x / div;
			int right = x % 10;

			if (left != right)
				return false;

			x = (x % div) / 10;
			div /= 100;
		}

		return true;
    }
}


class Solution {
    public boolean isPalindrome(int num) {
       int reversedNum = 0;
       int remainder;

    if (num < 0)
			return false;

    // store the number to originalNum
    int originalNum = num;

    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }

    // check if reversedNum and originalNum are equal
     return originalNum == reversedNum? true : false;
  }
}
