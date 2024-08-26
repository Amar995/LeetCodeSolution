package leet.code;

import java.util.Arrays;

public class SmallerThenCurrentNumber {
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int n[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {

				if (nums[j] < nums[i]) {
					count++;
				}

			}
			n[i] = count;
			count = 0;

		}
		System.out.println(Arrays.toString(n));
		return n;

	}

	public static void main(String[] args) {
		int nums[] = { 6, 5, 4, 8 };
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}

}
