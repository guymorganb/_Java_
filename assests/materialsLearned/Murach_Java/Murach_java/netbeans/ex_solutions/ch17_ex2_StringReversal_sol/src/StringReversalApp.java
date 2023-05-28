import java.util.Scanner;

public class StringReversalApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string to reverse: ");
        String input = sc.nextLine();

        System.out.println("Iterative string reversal...");
        String result = iterReverse(input);
        System.out.println(result);

        System.out.println("Recursive string reversal...");
        result = recReverse(input);
        System.out.println(result);
        System.out.println();
    }    

    /*
    ALGORITHM
    if str has one character or less, return the string
    otherwise, get the last character and add it to the beginning of the string
    */
    
    // iterative
    public static String iterReverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String reverseStr = "";        
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    // recursive
    public static String recReverse(String str) {
        // This method will make 1 recursive call for each character in the string
        if (str.length() <= 1) {    // base case
            return str;
        }
        else {
            return str.charAt(str.length()-1) + recReverse(str.substring(0, str.length()-1));
        }
    }
}