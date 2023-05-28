public class Book extends Product {
    private String author;

    public Book() {
        super();  // call constructor of Product superclass
        author = "";
        count++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {       
        return super.toString() + " by " + author;
    }
}
