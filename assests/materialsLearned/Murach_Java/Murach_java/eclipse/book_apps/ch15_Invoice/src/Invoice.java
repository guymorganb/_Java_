import java.text.NumberFormat;
import java.util.List;
import java.util.LinkedList;

public class Invoice {
    private List<LineItem> lineItems;

    public Invoice() {
        lineItems = new LinkedList<>();
    }

    public void addItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double getTotal() {
        double invoiceTotal = 0;
        for (LineItem lineItem : lineItems) {
            invoiceTotal += lineItem.getTotal();
        }
        return invoiceTotal;
    }

    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotal());
    }
}
