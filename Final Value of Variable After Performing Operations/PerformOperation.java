package leet.code;

public class PerformOperation {
	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (String s : operations) {
			if (s.startsWith("++") || s.endsWith("++")) {
				x = x + 1;
			} else {
				x = x - 1;
			}
		}
		System.out.println(x);
		return x;

	}

	public static void main(String[] args) {
		String s[] = { "++X", "++X", "X++" };
		int res=finalValueAfterOperations(s);
		System.out.println("Result is : "+res);

	}
}
