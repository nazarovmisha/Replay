package BookStore;

public class Book {
    private String name;
    private int bookPrice;
    private int year;


    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public Book setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }
}
