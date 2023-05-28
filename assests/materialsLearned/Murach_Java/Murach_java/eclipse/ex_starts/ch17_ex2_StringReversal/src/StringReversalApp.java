import java.util.Scanner;

public class StringReversalApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string to reverse: ");
        String input = sc.next();

        System.out.println("Iterative string reversal...");
        String result = iterReverse(input);
        System.out.println(result);

        System.out.println("Recursive string reversal...");
        result = recReverse(input);
        System.out.println(result);
        System.out.println();
    }    

    // iterative
    public static String iterReverse(String str) {        
        System.out.println("Iterative solution here...");
        return null;
    }

    // recursive
    public static String recReverse(String str) {
        System.out.println("Recursive solution here...");
        return null;
    }
}