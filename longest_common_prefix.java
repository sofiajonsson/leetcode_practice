class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String longestCommonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            String currentString = strs[i];

            while (j < longestCommonPrefix.length() && j < currentString.length() && longestCommonPrefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }

            if (j == 0) {
                return "";
            }

            longestCommonPrefix = longestCommonPrefix.substring(0, j);
        }

        return longestCommonPrefix;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
					return "";
				}
			String output = strs[0];
				for(int i=1; i<strs.length; i++){
						while(strs[i].indexOf(output)!=0){
							output = output.substring(0, output.length()-1);
						}
					}
				return output;
    }
}
