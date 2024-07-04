package leet.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {
	public  boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int in : arr) {
			if (!map.containsKey(in)) {
				map.put(in, 1);
			} else {
				map.put(in, map.get(in) + 1);
			}
		}
		
		Set<Integer> set = new HashSet<Integer>();
		for (int n : map.values()) {
			if (!set.add(n)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		UniqueNumberofOccurrences unique=new UniqueNumberofOccurrences();
		int arr[] = { 1,3 };
		boolean flag=unique.uniqueOccurrences(arr);
		System.out.println(flag);
	}

}
