package ProblemSolvingandCoding;


	import java.util.HashMap;
	import java.util.Map;

	public class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        // Create a hashmap to store values and their indices
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        // Iterate through the array
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            
	            // Check if the complement exists in the hashmap
	            if (map.containsKey(complement)) {
	                // Return the indices of the two numbers
	                return new int[] { map.get(complement), i };
	            }
	            
	            // Add the current number and its index to the hashmap
	            map.put(nums[i], i);
	        }
	        
	        // If no solution found (not expected per problem statement)
	        throw new IllegalArgumentException("No two sum solution");
	    }

	    // Main method to test the function
	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        
	        int[] result = solution.twoSum(nums, target);
	        
	        // Print the result
	        System.out.println("[" + result[0] + ", " + result[1] + "]");  // Output: [0, 1]
	    }
	}



