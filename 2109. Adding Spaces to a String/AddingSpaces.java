package leet.code;

import java.util.Arrays;

public class AddingSpaces {
	public static String addSpaces(String s, int[] spaces) {
		String str = "";
		String s2[] = new String[spaces.length + 1];
		System.out.println(s2.length);

		for (int i = 0; i < spaces.length; i++) {
			if (i == 0) {
				s2[i] = s.substring(i, spaces[i]);
			} else {
				s2[i] = s.substring(spaces[i - 1], spaces[i]);

			}
			s2[s2.length - 1] = s.substring(spaces[spaces.length - 1]);
		}
		return String.join(" ", s2);

	}

	public static void main(String[] args) {
		int sp[] = { 8, 13, 15 };
		System.out.println(addSpaces("LeetcodeHelpsMeLearn", sp));
	}

}
