package Strings;

public class CheckStringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check if one string is a permutation of another (they must have identical characters, but in a different order from one another)
		String str1 = "abcdefg";
		String str2 = "gcdbfea";
		String test = "";
		boolean IsPermutation = false;
		
		for(int i = 0; i< str1.length(); i++) {
			
			for(int j = 0; j < str2.length(); j++) {
	
				if(str2.charAt(j) == str1.charAt(i)) {
					test = test + str2.charAt(j);
				}
			}
		}
		if(str1.equals(test)) {
			IsPermutation = true;
		}
		System.out.print(IsPermutation);
		
		
	}

}
