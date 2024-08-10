package leet.code;

public class ScoreOfString {
	public static int scoreOfString(String s) {
		char ch[] = s.toCharArray();
		int sum = 0;

		int i = ch.length - 1;
		int j = 0;
		while (j < i) {
			int a = ch[j];
			int b = ch[++j];
			sum = sum + Math.abs(a - b);
		}
		return sum;

	}

	public static void main(String[] args) {
		scoreOfString("zaz");
	}

}
