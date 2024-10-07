class Solution {
    public boolean isValid(String s) {

        // Check if the string has an odd length
        if (s.length() % 2 == 1) {
            // If so, assume false because there will be a missing pair
            return false;
        }

        // Create a stack to push our elements in order
        Stack<Character> stack = new Stack<>();

        // Create a hash map to match elements to their corresponding pair
        HashMap<Character, Character> symbols = new HashMap<>();
        symbols.put('}', '{');
        symbols.put(']', '[');
        symbols.put(')', '(');

        // Create a list to validate valid opening symbols
        List<Character> openers = new ArrayList<Character>(){{
                        add('{');
                        add('[');
                        add('(');
                          }};

        for (int i = 0; i < s.length(); i++){
            
            // Check if current element is a valid key
            if (symbols.containsKey(s.charAt(i))) {

                // If stack is not empty and top of the stack matches current element then pop value from stack
                if (!stack.empty() && stack.peek() == symbols.get(s.charAt(i))) {
                    stack.pop();
                }

                // Otherwise, return false because string cannot be valid
                else { return false; }
            }

            // Check if current element is a valid opening symbol, if it is then push it in the stack
            else {
                if (openers.contains(s.charAt(i))) {
                    stack.push(s.charAt(i));
                }
                
                // Otherwise, return false due to illegal symbol
                else { return false; }
            }
        }
        
        // If the stack is empty, then all pairs have been found, otherwise there is a missing pair
        return (stack.empty());
    }
}
