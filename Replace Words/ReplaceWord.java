package leet.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWord {
	  public  String replaceWords(List<String> dictionary, String sentence) {
	        Set<String> dict = new HashSet<>(dictionary);
	        String[] words = sentence.split(" ");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (result.length() > 0) {
	                result.append(" ");
	            }
	            result.append(find(word, dict));
	        }
	        
	        return result.toString();
	    }
	    private String find(String word, Set<String> dict) {
	        for (int i = 1; i <= word.length(); i++) {
	            String prefix = word.substring(0, i);
	            if (dict.contains(prefix)) {
	                return prefix;
	            }
	        }
	        return word; 
	    }
	

	public static void main(String[] args) {

		List<String> dictionary = new ArrayList<String>(Arrays.asList("a", "b", "c"));
		String sentence = "aadsfasf absbs bbab cadsfafs";
		ReplaceWord repl=new ReplaceWord();
		String s=repl.replaceWords(dictionary, sentence);
		System.out.println("Sentence is: "+s);

		
	}
	}
	
