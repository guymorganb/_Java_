package Strings;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbcddeff";
		String ans = "";
		int i = 1;
		int index = 0;
		ans = ans + str.charAt(index);
		while (i < str.length()) {
			if(str.charAt(i) == ans.charAt(index)) {
				i++;
			}else {
				char tempChar = str.charAt(i);
				ans = ans + tempChar;
				index++;
				i++;
			}
		}
		System.out.print(ans);
	}

}
