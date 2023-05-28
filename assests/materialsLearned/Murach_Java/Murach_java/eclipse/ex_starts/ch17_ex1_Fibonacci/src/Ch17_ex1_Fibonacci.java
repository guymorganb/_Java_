
public class Ch17_ex1_Fibonacci {

    public static void main(String[] args) {
        int iterResult;
        int recResult;
        iterResult = iterFibo(16);
        recResult = recFibo(16);
        
        System.out.println(iterResult);
        System.out.println(recResult);
    }
    
    public static int iterFibo(int n) {
        if (n == 0) {          // base case 1
            return 0;
        } else if (n == 1) {  // base case 2
            return 1;
        }
        int n1 = 0, n2 = 1, fib = 0;
        for (int i =  2; i < n+1; i++) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        }
        return fib;
    }
    
    public static int recFibo(int n) {
        if (n == 0) {         // base case 1
            return 0;
        } else if (n == 1) {  // base case 2
            return 1;
        } else {
            return recFibo(n - 1) + recFibo(n - 2);
        }
    }


}
