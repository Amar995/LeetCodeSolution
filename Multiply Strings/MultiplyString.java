package leet.code;

import java.math.BigInteger;

public class MultiplyString {
	 public static String multiply(String num1, String num2) {
		 BigInteger n1=new BigInteger(num1);
		 BigInteger n2=new BigInteger(num2);
		 BigInteger res=n1.multiply(n2);
		 return String.valueOf(res);

	    }
public static void main(String[] args) {
	System.out.println(multiply("498828660196", "840477629533"));
}
}
