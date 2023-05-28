import java.util.Scanner;
import java.text.NumberFormat;

public class InvoiceApp {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        final double DISCOUNT_PCT = .05;
        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter subtotal: ");
            String input = sc.nextLine();
            double subtotal = Double.parseDouble(input);
            System.out.println();  // print blank line            

            // calculate the results
            double discountAmount = subtotal * DISCOUNT_PCT;
            discountAmount = (double) Math.round(discountAmount * 100) / 100;
            double total = subtotal - discountAmount;

            // format and display the discount percent
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.printf("%-20s%12s%n", 
                    "Discount percent:", percent.format(DISCOUNT_PCT));

            // a debugging statement that has been commented out
            /*
            System.out.println("UNFORMATTED RESULTS\n"
                               + "Subtotal:         " + subtotal + "\n"
                               + "Discount amount:  " + discountAmount + "\n"
                               + "Invoice total:    " + total + "\n"
                               + "FORMATTED RESULTS");            
            */
            
            // format and display the floating-point numbers
            String format = "%-20s%,12.2f%n";
            System.out.printf(format, "Subtotal:", subtotal);
            System.out.printf(format, "Discount amount:", discountAmount);
            System.out.printf(format, "Invoice total:", total);
            System.out.println();  // print blank line
            
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}