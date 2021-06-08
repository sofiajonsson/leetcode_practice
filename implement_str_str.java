class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

class Solution {
 public int strStr(String haystack, String needle) {
     if("".equals(needle) || haystack.equals(needle)){
         return 0;
     }

     for(int i = 0 ; i<=haystack.length() - needle.length(); i++){

         if(haystack.substring(i, i+needle.length()).equals(needle)){
             return i;
         }
     }

     return -1;
  }
}
