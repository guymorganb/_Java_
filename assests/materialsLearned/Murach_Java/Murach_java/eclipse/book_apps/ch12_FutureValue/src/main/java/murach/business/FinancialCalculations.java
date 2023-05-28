package murach.business;

public class FinancialCalculations {

    public static double calculateFutureValue(double monthlyInvestment,
            double interestRate, int years) {
        double monthlyInterestRate = interestRate/100;
        int months = years * 12;
        
        double futureValue = 0.0;
        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment) *
                          (1 + monthlyInterestRate);
        }
        return futureValue;
    }    
}
