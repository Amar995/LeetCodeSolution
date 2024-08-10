package leet.code;

import java.util.Arrays;

public class ReversePrefixOFWord {

	public static String reversePrefix(String word, char ch) {

		String str[] = word.split(String.valueOf(ch), 2);
		StringBuffer sb = null;
		if (str.length > 1) {
			sb = new StringBuffer(str[0] + ch);

			sb.reverse().append(str[1]);
		} else {
			sb = new StringBuffer(word);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String s = "abcdefd";
		String ss[] = s.split("i", 2);
		System.out.println(Arrays.toString(ss));
		System.out.println(reversePrefix(s, 'i'));

	}
}
