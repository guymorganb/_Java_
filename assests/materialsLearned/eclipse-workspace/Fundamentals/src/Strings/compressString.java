package Strings;

public class compressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbcddeff";
		String ans = "";
		int i = 1;
		int index = 0;
		int count = 1;
		ans = ans + str.charAt(index);
		while (i < str.length()) {
			if(str.charAt(i) == ans.charAt(index)) {
				count ++;
				i++;
			}else {
				if(count > 1) {
					ans = ans + count;
					index++;
				}
				char tempChar = str.charAt(i);
				ans = ans + tempChar;
				count = 1;
				index++;
				i++;
			}
		}
		if (count > 1) {
			ans = ans+count;
		}
		System.out.print(ans);
	}

}
