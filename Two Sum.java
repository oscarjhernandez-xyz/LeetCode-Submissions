class Solution {
    public int[] twoSum(int[] nums, int target) {

        // If there is only 2 elements, return the first and second element in the array
        if (nums.length == 2){
            return new int[] {0, 1};
        }

        // Otherwise, create a hash map to add elements as we iterate through them
        HashMap<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            // Determine what the difference is between target and current element
            int difference = target - nums[i];
            
            // If difference is already in the hash map, return the indices of both elements
            if (indices.containsKey(difference)){
                return new int[] {indices.get(difference), i};
            }
            
            // Otherwise, add current element to the hash map
            indices.put(nums[i], i);
        }

        // Shouldn't reach this statement since every test case has a solution
        return null;
    }
}
