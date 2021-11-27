import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books;
    
    Bookcase() {
        books = new ArrayList<Book>();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public void addBook(Book book) {
        getBooks().add(book);
    }
    
    public void removeBook(Book book) {
        getBooks().remove(book);
    }
    
    public void removeBook(String bookTitle) {
        for (Book book: getBooks()) {
            if (book.getTitle() == bookTitle) {
                getBooks().remove(book);
            }
        }
    }
    
    public int getBookAmount() {
        return getBooks().size();
    }
    
    public void displayInfo() {
        System.out.println("There are " + getBookAmount() + " books on the bookcase:");
        for (Book book: getBooks()) {
            book.displayInfo();
        }
    }
}