package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "racecar";
		String pal = "";
		for(int i = str.length()-1; i >=0; i--){
			pal = pal + str.charAt(i);
		}
		boolean isValid = false;
		
		if (pal.equals(str)){
			isValid = true;
		}
	}

}
