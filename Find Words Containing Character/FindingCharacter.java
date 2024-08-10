package leet.code;

import java.util.ArrayList;
import java.util.List;

public class FindingCharacter {

	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < words.length; i++) {
			int res = words[i].indexOf(x);
			if (res >= 0) {
				list.add(i);
			}

		}

		return list;
	}

	public static void main(String[] args) {
		String words[] = { "abc", "bcd", "aaaa", "cbc" };
		char x = 'a';
		List li=findWordsContaining(words, x);
		System.out.println("Result is: "+li);
	}
}
