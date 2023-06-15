package Strings;

public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, Im learning how to code.";
		String ans = "";
		int wordStart = 0;
		int i = 0;
		for(; i< str.length(); i++) {
			if(str.charAt(i) == ' ') {	// will cause the loop to execute if statement, when it reaches a space
				// reverse current word
				int wordEnd = i-1;
				String reversedWord = ""; // strings are immutable so a variable to store a new string is needed
				for(int j = wordStart; j<= wordEnd; j++) {
					reversedWord = str.charAt(j) + reversedWord; // concatenates the chars to the begining of reversed word
				}
				// add it to final string
				ans += reversedWord + " ";
				wordStart = i + 1;
			}
		}
		// handle the last word
		int wordEnd = i-1;
		String reversedWord = ""; // strings are immutable so a variable to store a new string is needed
		for(int j = wordStart; j<= wordEnd; j++) {
			reversedWord = str.charAt(j) + reversedWord; // concatenates the chars to the begining of reversed word
		
		
		}
		ans += reversedWord + " ";
		System.out.print(ans);
		//return ans;
	}

}
