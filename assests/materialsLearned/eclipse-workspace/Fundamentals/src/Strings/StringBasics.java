package Strings;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getting to know strings
		 //char arr[] = {'C','o','d','i','n','g'};
		 String str1 = "abcd";
		 //String str2 = " is fun ";
		 String str3 = "abcda";
		 //System.out.println(str1.contains("ing"));
		 //str1 += str2;
		 //str2 = str1.concat(str2);
		 //System.out.println(str1.equals(str3));
		 // will compare lexicographically and print the difference in ASCII values
		 System.out.println(str1.compareTo(str3));
		//System.out.println(str1.length());
		//System.out.println(str1.charAt(3));
		
		 String a="coding";
		 for(int i=2;i<5;i++)
		 {
		     System.out.print(a.substring(i-2,i+1));
		 }
		 }
		
		
		
	}

