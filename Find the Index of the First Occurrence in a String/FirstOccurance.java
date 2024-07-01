package leet.code;

public class FirstOccurance {
	public int strStr(String haystack, String needle) {
		int position = haystack.indexOf(needle);
		return position;
	}

	public static void main(String[] args) {
		FirstOccurance first = new FirstOccurance();
		int pos = first.strStr("leetcode", "leeto");
		System.out.println("First Occurance position is: " + pos);

	}
}
