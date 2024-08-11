package leet.code;

import java.util.Arrays;

public class RemoveTralingZero {
	public String removeTrailingZeros(String num) {
		StringBuffer ss = new StringBuffer(num);
		char ch[] = ss.reverse().toString().toCharArray();
		String sss = null;
		if (num.endsWith("0")) {
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '0') {
					continue;
				} else {
					sss = ss.substring(i);
					break;
				}
			}
			StringBuffer res = new StringBuffer(sss);
			res.reverse();
			return res.toString();

		}
		return num;

	}

	public String removeTrailingZeros2ndWay(String num) {
		return num.replaceAll("0+$", "");

	}

	public static void main(String[] args) {
		RemoveTralingZero vm = new RemoveTralingZero();
		String sss = vm.removeTrailingZeros("123000");
		System.out.println(sss);
	}
}
