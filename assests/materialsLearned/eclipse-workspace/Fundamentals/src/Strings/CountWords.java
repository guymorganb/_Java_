package Strings;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = "Hello World";  
		
		String[] tokens = str.split("\\s+"); // split by whitespace
	        int tokenCount = tokens.length;
	        
	        System.out.print(tokenCount);
	}

}
