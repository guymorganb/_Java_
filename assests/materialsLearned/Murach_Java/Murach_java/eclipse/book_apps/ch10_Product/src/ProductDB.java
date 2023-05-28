public class ProductDB {
    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database.
        // For now, this code just uses if/else statements
        // to return the correct product data.

        Product product = null;

        if (productCode.equalsIgnoreCase("java")
                || productCode.equalsIgnoreCase("jsp")
                || productCode.equalsIgnoreCase("mysql")) {
            Book book = new Book();
            if (productCode.equalsIgnoreCase("java")) {
                book.setCode(productCode);
                book.setDescription("Murach's Java Programming");
                book.setPrice(57.50);
                book.setAuthor("Joel Murach");
            } else if (productCode.equalsIgnoreCase("jsp")) {
                book.setCode(productCode);
                book.setDescription("Murach's Java Servlets and JSP");
                book.setPrice(57.50);
                book.setAuthor("Mike Urban");
            } else if (productCode.equalsIgnoreCase("mysql")) {
                book.setCode(productCode);
                book.setDescription("Murach's MySQL");
                book.setPrice(54.50);
                book.setAuthor("Joel Murach");
            }
            product = book; // set Product object equal to the Book object
        } else if (productCode.equalsIgnoreCase("netbeans")) {
            Software software = new Software();
            software.setCode("netbeans");
            software.setDescription("NetBeans");
            software.setPrice(0.00);
            software.setVersion("12.3");
            product = software; // set Product object equal to the Software object
        }
        return product;
    }

}
