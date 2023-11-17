package Design_patterns.singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanOut;

    private BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }

    public static BookSingleton borrowBook() {
        if (!isLoanOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton bookReturned) {
        isLoanOut = false;
    }
}
