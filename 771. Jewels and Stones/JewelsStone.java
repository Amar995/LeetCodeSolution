package leet.code;

import java.util.Arrays;

public class JewelsStone {
	public static int numJewelsInStones(String jewels, String stones) {
		int count=0;
		char ch[]=jewels.toCharArray();
		char c2[]=stones.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(ch[i]==c2[j])
				{
					count++;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
	}

}
