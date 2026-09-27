class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    Book(int bookId, String title, String author,
         String category, double price, boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    void displayBookDetails() {
        System.out.println("BookId : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println("Available : " + available);
    }
}

public class libraryManagement {
    public static void main(String[] args) {

        Book b1 = new Book(
            101,
            "Java",
            "Erich",
            "Computer Science",
            650,
            true
        );

        Book b2 = new Book(
            102,
            "C Program",
            "Tom",
            "Computer Science",
            600,
            false
        );

        System.out.println("Library Book Details");
        b1.displayBookDetails();
        b2.displayBookDetails();
    }    
} 