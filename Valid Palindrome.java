class Solution {
    public boolean isPalindrome(String s) {

        // Create a StringBuilder for a revised string of non-alphanumeric characters
        StringBuilder forwardString = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);

            // Check if character is alphanumeric, if it is then append it to revised string
            if (Character.isLetterOrDigit(c)){
                forwardString.append(Character.toLowerCase(c));
            }
        }
        
        // Check if revised string is a palindrome
        if (forwardString.toString().equals(forwardString.reverse().toString())){
            return true;
        }

        return false;
    }
}
