import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Future Value Calculator");
        System.out.println(); // blank line
        
        Scanner sc = new Scanner(System.in);
        String input;
        
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            System.out.print("Enter monthly investment:   ");
            input = sc.nextLine();
            double monthlyInvestment = Double.parseDouble(input);
            
            System.out.print("Enter yearly interest rate: ");
            input = sc.nextLine();
            double interestRate = Double.parseDouble(input);
            
            System.out.print("Enter number of years:      ");
            input = sc.nextLine();
            int years = Integer.parseInt(input);

            // call the method that calculates the future value
            double futureValue = calculateFutureValue(monthlyInvestment,
                    interestRate, years);
            
            // format and display the result
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value:               "
                    + currency.format(futureValue));
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }                
    }

    private static double calculateFutureValue(double monthlyInvestment,
            double interestRate, int years) 
    {
        // convert yearly values to monthly values
        double monthlyInterestRate = interestRate / 12 / 100;
        int months = years * 12;
            
        // calculate future value
        double futureValue = 0.0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment)
                    * (1 + monthlyInterestRate);
        }
        return futureValue;
    }
}