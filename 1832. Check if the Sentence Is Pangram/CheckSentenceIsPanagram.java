package leet.code;

import java.util.HashSet;
import java.util.Set;

public class CheckSentenceIsPanagram {

	public static boolean checkIfPangram(String sentence) {
		if (sentence.length() < 26) {
			return false;
		}
		char ch[] = sentence.toCharArray();
		Set<Character> set = new HashSet<Character>();

		for (char ch1 : ch) {
			set.add(ch1);
		}
		
		return set.size()==26;

	}

	public static void main(String[] args) {
		System.out.println(checkIfPangram("thequirownfoxjumpsoverthelazydog"));
	}

}
