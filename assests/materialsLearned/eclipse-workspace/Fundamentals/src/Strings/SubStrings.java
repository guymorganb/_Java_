package Strings;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print substrings of pqrs.
		String str = "pqrs";
		
		for(int i = 0; i <= str.length(); i++) {
			for(int j = i; j<= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
		for(int m = 1; m <= str.length(); m++) {
			
			for(int n = 0; n <= str.length()-m; n++) {
				
				int end = m + n - 1;
				
				System.out.println(str.substring(n, end+1));
			}
		}
		StringBuffer str1 = new StringBuffer("");
		for(int k=0;k<5;k++){
			
		    str1.append((char)('a'+k));
		}
		System.out.println(str1);
		
	}

}
