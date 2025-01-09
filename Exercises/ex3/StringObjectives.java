package ex3;
import java.util.Stack;

public class StringObjectives {
	
	public String ReverseString(String input){
		
		Stack<Character> st = new Stack<Character>();
		
		for(char c : input.toCharArray()) {
			
			st.push(c);
		}
		
		StringBuilder reInput = new StringBuilder();
		
		while(!st.isEmpty()) {
			reInput.append(st.pop());
		}
		
		return reInput.toString();
		
		
		
		
	public int countVowels(String input) {
			
			int vowelCount = 0;
			String vowels = "AEIOUaeiou";
			
			for(char c : input.toCharArray()) {
				if(vowels.indexOf(c) != -1) {
					vowelCount++;
				}
			}
			
			return vowelCount;
			
	}
		
}


