package BookStore;

public class BookStore {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        Book book = new Book();
        book.setName("Hobbit");
        book.setYear(1985);
        book.setBookPrice(100);
        addBook(books, book);

        Book book1 = new Book();
        book1.setName("My-My");
        book1.setYear(1852);
        book1.setBookPrice(50);
        addBook(books, book1);

        Book book2 = new Book();
        book2.setName("My-My");
        book2.setYear(1852);
        book2.setBookPrice(50);
        addBook(books, book1);

        Book book3 = new Book();
        book3.setBookPrice(100);
        book3.setYear(1995);
        book3.setName("Fool");
        addBook(books, book3);

         Book book4= new Book();
         book4.setName("Geografiya");
         book4.setYear(2009);
         book4.setBookPrice(220);
         addBook(books,book4);

        printAllBooks(books);
    }

    public static boolean checkBook(Book[] books, Book book) {
        for (Book item : books) {
            if (item != null && book.getName().equals(item.getName()) && book.getYear() == item.getYear()) {
                System.out.println("Такая книга уже есть");
                return false;
            }
        }
        System.out.println("Такой книги нет");
        return true;
    }

    public static void addBook(Book[] books, Book book) {
        if (checkBook(books, book)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    System.out.println("Книга успешно добалена");
                    break;
                }
                if (i == books.length - 1) {
                    System.out.println("Картотека переполнена");
                }
            }
        }
    }

    public static void printAllBooks(Book[] books) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i + 1, books[i].getName(), books[i].getYear(), books[i].getBookPrice());
            }
        }
    }
}

