package test.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowel4 {
	public static String reverseVowels(String s) {

		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

		char[] charArray = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (set.contains(charArray[i]) && set.contains(charArray[j])) {

				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
				i++;
				j--;
			} else if (set.contains(s.charAt(i)) && !set.contains(s.charAt(j))) {
				j--;
			} else if (!set.contains(s.charAt(i)) && set.contains(s.charAt(j))) {
				i++;
			} else {
				i++;
				j--;
			}
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		String ss = reverseVowels("aA");
		System.out.println(ss);
	}

}
