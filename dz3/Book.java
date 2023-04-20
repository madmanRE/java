package dz3;

public class Book {
    String title;
    String authorName;
    Double price;
    Integer publishedYear;
    Integer pagesAmount;

    public Book(String title, String authorName, Double price, Integer publishedYear, Integer pagesAmount) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.publishedYear = publishedYear;
        this.pagesAmount = pagesAmount;
    }

    public Book(){

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", publishedYear=" + publishedYear +
                ", pagesAmount=" + pagesAmount +
                '}';
    }
}
