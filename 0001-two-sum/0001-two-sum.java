import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers we've seen and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the map contains the number we need to hit our target, we're done!
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, put the current number and its index into the map
            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
}