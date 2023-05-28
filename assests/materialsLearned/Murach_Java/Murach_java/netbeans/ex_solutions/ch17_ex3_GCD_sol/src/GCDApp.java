import java.util.Scanner;

public class GCDApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the second number: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Iterative GCD...");
        int result = iterGCD(firstNumber, secondNumber);
        System.out.println(result);

        System.out.println("Recursive GCD...");
        result = recGCD(firstNumber, secondNumber);
        System.out.println(result);
        System.out.println();
    }    

    // iterative
    public static int iterGCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // recursive
    public static int recGCD(int a, int b) {
        // This method will make a small number of recursive calls 
        // because it reduces the search space exponentially with each iteration
        if (b == 0) {   // base case
            return a;
        }
        else {
            System.out.println("Recursive call");
            return recGCD(b, a % b);
        }
    }
}