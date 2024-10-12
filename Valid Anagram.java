class Solution {
    public boolean isAnagram(String s, String t) {

        // If string lengths differ they cannot be valid anagrams
        if (s.length() != t.length()) { return false; }

        // Convert both strings to char arrays
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        // Sort both arrays
        Arrays.sort(s_char);
        Arrays.sort(t_char);

        // Convert back to strings and compare if they are equal
        if (String.valueOf(s_char).equals(String.valueOf(t_char))) { return true; }

        return false;
    }
}
