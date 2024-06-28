package test.test;

class Solution {
    public static String mergeAlternately(String word1, String word2) {
        char ch[]=word1.toCharArray();
        char ch2[]=word2.toCharArray();
        String str="";
        
       	if(ch.length==ch2.length)
       	{
       		for(int i=0;i<ch.length;i++)
            {
       		str=str+ch[i]+ch2[i];
            }
       	}
       	else if(ch.length<ch2.length)
       	{
       		for(int i=0;i<ch.length;i++)
            {
       		str=str+ch[i]+ch2[i];
            }
       		for(int i=ch.length;i<ch2.length;i++)
       		{
       			str=str+ch2[i];
       		}
       	}else
       	{
       		for(int i=0;i<ch2.length;i++)
            {
       		str=str+ch[i]+ch2[i];
            }
       		for(int i=ch2.length;i<ch.length;i++)
       		{
       			str=str+ch[i];
       		}
       	}
       
        return str;

    }
    public static void main(String[] args) {
		String s=mergeAlternately("abcd", "pq");
		System.out.println(s);
	}
}
