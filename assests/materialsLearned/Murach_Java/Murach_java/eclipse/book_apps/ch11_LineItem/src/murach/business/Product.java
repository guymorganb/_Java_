package murach.business;

import java.text.NumberFormat;

/**
 * The Product class represents a product.
*/
public class Product {
    private String code;
    private String description;
    private double price;

    /**
     * Creates a Product with default values.
     */
    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    
    /**
     * Creates a Product with the specified values.
     * @param code a String for the product code
     * @param description a String for the product description
     * @param price a double for the product price
     */
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    /**
     * Sets the product code.
     * @param code a String for the product code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the product code.
     * @return a String for the product code
     */
    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}