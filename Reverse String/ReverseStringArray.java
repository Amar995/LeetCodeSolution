package leet.code;

public class ReverseStringArray {
	public void reverseString(char[] s) {
		int count = 0;
		char[] charArray = new char[s.length];
		for (int i = s.length - 1; i >= 0; i--) {
			charArray[count] = s[i];
			count++;
		}
		for (int i = 0; i < charArray.length; i++) {
			s[i] = charArray[i];
		}
	}

	public static void main(String[] args) {
		ReverseStringArray rev = new ReverseStringArray();
		String[] s = { "h", "e", "l", "l", "o" };
		String st = "";
		for (String str : s) {
			st = st + str;
		}
		char[] charArray = st.toCharArray();
		rev.reverseString(charArray);
	}
}
