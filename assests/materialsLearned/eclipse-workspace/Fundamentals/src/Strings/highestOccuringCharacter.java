package Strings;

public class highestOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbcfddaeffe";
		char greatestIndex = str.charAt(0);
		int occurance = 0;
		int greatestOccurance = 0;
		for(int i = 0; i < str.length(); i++) {
			
			String temp = str.replace(String.valueOf(str.charAt(i)), "");
			occurance = str.length() - temp.length();
			
			if(occurance > greatestOccurance) {
				greatestIndex = str.charAt(i);
				greatestOccurance = occurance;
			}
		}System.out.print(greatestIndex);
	}

}
