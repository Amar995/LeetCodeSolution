package test.test;

import java.util.Arrays;

public class ReverseWord {
	public static String reverse(String s)
	{
		
		String[] ch=s.trim().split(" ");
		String str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			if(!ch[i].isBlank())
			str=str+ch[i]+" ";
		}
		return str.trim();
	}
public static void main(String[] args) {
	System.out.println(reverse("a good   example"));
}
}
