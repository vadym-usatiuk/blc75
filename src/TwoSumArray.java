//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
// 
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
//Constraints:
//
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.
// 
//
//Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

import java.util.HashMap;

public class TwoSumArray {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		TwoSumArray obj = new TwoSumArray();
		int[] indices = obj.twoSum(arr, target);
		obj.printAll(indices);
	}

	public void printAll(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
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
}
