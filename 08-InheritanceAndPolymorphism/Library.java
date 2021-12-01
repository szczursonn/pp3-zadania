import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books;
    
    Library() {
        this.books = new ArrayList<Book>();
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
    public int getBookAmount() {
        return getBooks().size();
    }
    
    public void display() {
        System.out.println("There are " + getBookAmount() + " books in the library: ");
        for (Book book: getBooks()) {
            System.out.print("- ");
            book.display();
        }
    }
}