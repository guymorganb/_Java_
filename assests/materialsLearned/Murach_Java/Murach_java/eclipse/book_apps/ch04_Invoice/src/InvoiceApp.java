import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        System.out.println("The Invoice Total Calculator\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter customer type (r/c): ");
            String customerType = sc.nextLine();
            
            System.out.print("Enter subtotal: ");
            double subtotal = Double.parseDouble(sc.nextLine());
            System.out.println();

            // get the discount percent
            double discountPercent = switch(customerType) {
                case "r", "R" -> {
                    if (subtotal >= 250) {
                        yield .2;
                    } else if (subtotal >= 100) {
                        yield .1;
                    } else {  
                        yield 0.0;
                    } 
                }
                case "c", "C" -> {
                    if (subtotal >= 250) {
                        yield .3;
                    } else {
                        yield .2;
                    }
                }
                default -> .1;
            };

            // calculate the discount amount and round to 2 decimals
            double discountAmount = subtotal * discountPercent;
            discountAmount = Math.ceil(discountAmount * 100) / 100;

            // calculate the total
            double total = subtotal - discountAmount;

            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            String format = "%-20s%12s%n";

            System.out.println("INVOICE");  // print blank line            
            System.out.printf(format, "Subtotal:", 
                    currency.format(subtotal));
            System.out.printf(format, "Discount percent:", 
                    percent.format(discountPercent));
            System.out.printf(format, "Discount amount:", 
                    currency.format(discountAmount));
            System.out.printf(format, "Total:", 
                    currency.format(total));
            System.out.println();  // print blank line            

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}