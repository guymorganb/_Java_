package Strings;

public class reverseStringWordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Coding is fun.";
		String ans = "";
		String reversed = "";
		// use wordStart to manipulate starting point of j
		int wordStart = 0;
		// use outer for loop to set the parameters for j
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				
				int wordEnd = i-1;
				
				for(int j = wordStart; j <= wordEnd; j++){
					reversed += str.charAt(j);
				}
				
				ans = reversed + " " + ans ;
				wordStart = i + 1;
				reversed = "";
			}
		}
		// handle last word (outside of the outer loop)
		int wordEnd = str.length() - 1;
		for(int j = wordStart; j<= wordEnd; j++) {
			reversed += str.charAt(j);
		}
		ans = reversed + " " + ans;
		
		System.out.print(ans);
		 
	}

}
