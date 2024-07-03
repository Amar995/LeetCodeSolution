package leet.code;

import java.util.Arrays;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		Arrays.sort(nums);
		int res = 0;
		res = Arrays.binarySearch(nums, target);
		if (res < 0) {
			int nums1[] = new int[nums.length + 1];
			for (int i = 0; i < nums.length; i++) {
				nums1[i] = nums[i];
			}
			nums1[nums.length] = target;
			Arrays.sort(nums1);
			res = Arrays.binarySearch(nums1, target);
		}
		return res;
	}

	public static void main(String[] args) {
		SearchInsertPosition pos = new SearchInsertPosition();
		int num[] = { 1, 9, 5, 6 };
		int position = pos.searchInsert(num, 2);
		System.out.println(position);
	}
}
