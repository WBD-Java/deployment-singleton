public class BookSingleton {
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private String author;
    private String title;

    public BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }

            isLoanedOut = true;
            return book;
        }
        return null;
    }
}
