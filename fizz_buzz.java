class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> ans = new ArrayList<String>();
        for (int num = 1; num <=n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5){
                ans.add("FizzBuzz");
            } else if (divisibleBy3){
                ans.add("Fizz");
            } else if (divisibleBy5){
                ans.add("Buzz");
            } else {
               ans.add(Integer.toString(num));
            }
        }
        return ans;
    }
}


class Solution {
    public List<String> fizzBuzz(int n) {
          // instantiate new ans list
    List<String> ans = new ArrayList<String>();

    // Instantiate hash map to store all fizzbuzz mappings
    HashMap<Integer, String> fizzBizzDict =
        new HashMap<Integer, String>() {
          {
            put(3, "Fizz");
            put(5, "Buzz");
          }
        };

    for (int num = 1; num <= n; num++) {

      String numAnsStr = "";

      for (Integer key : fizzBizzDict.keySet()) {

        // If the num is divisible by key,
        // add the corresponding string mapping to current numAnsStr
        if (num % key == 0) {
          numAnsStr += fizzBizzDict.get(key);
        }
      }

      if (numAnsStr.equals("")) {
        // Condition for not divisible by 3 or 5, add the number
        numAnsStr += Integer.toString(num);
      }

      // Append the current answer str to the ans list
      ans.add(numAnsStr);
    }

    return ans;
  }
}
