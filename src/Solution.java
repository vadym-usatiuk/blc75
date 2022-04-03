import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		Solution obj = new Solution();
		int[] indices = obj.twoSum(arr, target);
		obj.printAll(indices);
	}

	public int[] twoSum(int[] nums, int target) {
		// Create a hashmap which accepts integer datatype as key and value.
		HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		// Iterate through each element in the given array starting from the first
		// element.
		for (int i = 0; i < nums.length; i++) {
			// In each iteration check if required number
			// (required number = target sum - current number) is present in the given
			// array.
			Integer requiredNum = (Integer) (target - nums[i]);
			// If present, return {required number index, current number index} as result.
			if (indexMap.containsKey(requiredNum)) {
				int toReturn[] = { indexMap.get(requiredNum), i };
				return toReturn;
			}
			// Otherwise add the current iteration number as key and its index as value to
			// the hashmap.
			// Repeat this until you find the result.
			indexMap.put(nums[i], i);
		}
		return null;
	}

	public void printAll(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
