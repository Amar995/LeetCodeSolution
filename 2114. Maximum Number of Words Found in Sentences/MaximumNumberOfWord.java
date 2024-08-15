package leet.code;

public class MaximumNumberOfWord {
	 public int mostWordsFound(String[] sentences) {
	       int count = 0;
			for (int i = 0; i < sentences.length; i++) {
				int res = sentences[i].split(" ").length;
				if (res > count) {
					count = res;
				}

			}

			return count; 
	    }

	public static void main(String[] args) {
		MaximumNumberOfWord max=new MaximumNumberOfWord();
		String str[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int res=max.mostWordsFound(str);
		System.out.println("The Result is:  "+res);
	}

}
