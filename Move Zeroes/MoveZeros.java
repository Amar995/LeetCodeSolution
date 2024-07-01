package leet.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
	public void moveZeroes(int[] nums) {

		List<Integer> li = new ArrayList<Integer>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				li.add(nums[i]);
			}
		}
		while (nums.length > li.size()) {
			li.add(0);
		}
		for (int i = 0; i < li.size(); i++)
			nums[i] = li.get(i);
	}

	public static void main(String[] args) {
		int num[] = { 0, 1, 0, 3, 12 };
		MoveZeros move = new MoveZeros();
		move.moveZeroes(num);
		System.out.println(Arrays.toString(num));
	}
}
