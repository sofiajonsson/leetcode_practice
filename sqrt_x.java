class Solution {
    public int mySqrt(int x) {
         return (int) Math.sqrt(x);
    }
}

class Solution {
    public int mySqrt(int x) {
         if (x == 0){return 0;}//0 * 0 is 0
        int i = 1; //far left pointer
        int j = x; //far right pointer
        while (i < j){
            int mid = (i + (j-i) / 2) + 1; //prevent infinite loops and overflows
            int div = x/mid; //prevent integer overflows
            if (div == mid){return mid;} //find the exact sqrt
            if (div > mid){i = mid;} //i is too small
            else {j = mid-1;}//j is too big, mid is no good
        }
        return i; //our left pointer crossed over our right, return our closest guess  
    }
}
