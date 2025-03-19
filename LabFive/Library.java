//Task 2
class LibraryBook {
    String title;
    String author;
    int bookID;

    // Constructor using 'this' keyword
    LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    // Method to display book details
    void displayBookInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Book ID: " + this.bookID);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "Herbert Schildt", 101);
        LibraryBook book2 = new LibraryBook("Clean Code", "Robert C. Martin", 102);

        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
    }
}
