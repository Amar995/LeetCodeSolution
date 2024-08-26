package leet.code;

public class FaultyKeyword {
	public static String finalString(String s) {
       char ch[]=s.toCharArray();
       StringBuilder str=new StringBuilder();
       for(int i=0;i<s.length();i++)
           {
    	   if(s.charAt(i)=='i')
    	   {
    		   str.reverse();
    		 
    	   }else
    	   {
    		   str.append(s.charAt(i));
    	   }
	
           }
       System.out.println(str);
	return str.toString();
	}

	public static void main(String[] args) {
		String s = "string";
		System.out.println(finalString(s));
	}

}
