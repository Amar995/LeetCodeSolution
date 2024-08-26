package leet.code;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDisString {
	public static String kthDistinct(String[] arr, int k) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String str : arr) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		int count = 0;
System.out.println(map);
		for (String str : arr) {
			if (map.get(str) == 1) {
				count++;
			}
			if (count == k) {
				return str;
			}
		}
		return "";
	}

	public static void main(String[] args) {
		String arr[] = { "d","b","c","b","c","a"};
		int k = 374;
		System.out.println(kthDistinct(arr, k));
	}

}
