package leet.code;

import java.util.Arrays;

public class ReverseInteger {

	public static int reverse(int x) {
		String str = String.valueOf(x);
		int result = 0;
		StringBuffer sb = null;
		String res = null;
		if (x < 0) {
			try {
				String first = String.valueOf(str.charAt(0));
				sb = new StringBuffer(str.substring(1));
				sb.reverse();
				res = first.concat(sb.toString());
				result = Integer.parseInt(res);
				if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
					return 0;
				} else {
					return result;
				}
			} catch (NumberFormatException e) {
				return 0;
			}

		} else {
			try {
				sb = new StringBuffer(str);
				sb.reverse();
				res = sb.toString();
				result = Integer.parseInt(res);
				if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
					return 0;
				} else {
					return result;
				}
			} catch (NumberFormatException e) {
				return 0;
			}
		}

	}

	public static void main(String[] args) {
		int r = reverse(-9646);
		System.out.println(r);
	}
}
