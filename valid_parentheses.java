class Solution {
    public boolean isValid(String str) {

//         Add input values to HashMap
        Map<Character, Character> parenthesesMapping = new HashMap<>();
    parenthesesMapping.put('(', ')');
    parenthesesMapping.put('{', '}');
    parenthesesMapping.put('[', ']');

//         Implement a Stack to push||pop values
    Stack<Character> parentheses = new Stack<>();
    for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(parenthesesMapping.containsKey(c)) {
            parentheses.push(c);
        } else {
            if(parentheses.isEmpty()) {
                return false;
            }
            char target = parentheses.pop();
            if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
                return false;
            }
        }
    }
//         Implement conditional
    if(!parentheses.isEmpty()) {
        return false;
    }
    return true;
  }
}
