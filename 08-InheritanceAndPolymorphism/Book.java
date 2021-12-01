public class Book {
    private String title;
    private Writer author;
    private Publisher publisher;
    private int publicationYear;
    
    Book(String title, Writer author, Publisher publisher, int publicationYear) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setPublicationYear(publicationYear);
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setAuthor(Writer author) {
        this.author = author;
    }
    public Writer getAuthor() {
        return author;
    }
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    
    public void display() {
        System.out.println(getTitle() + ", by " + getAuthor() + ", " + getPublicationYear() + ", Wydawnictwo: " + getPublisher());
    }
    
    static public void main() {
        Publisher pub1 = new Publisher("super wydawnictwo", "Krakow");
        Publisher pub2 = new Publisher("aaaaaaaaaaa", "Radom");
        
        Writer wr1 = new Writer("Adam", "Mickiewicz", "poezja");
        Writer wr2 = new Writer("Henryk", "Sienkiewicz", "powiesc");
        Writer wr3 = new Writer("Juan", "Kowalski", "komedia");
        
        Book b1 = new Book("Pan Tadeusz", wr1, pub1, 2001);
        Ebook eb1 = new Ebook("Krzyzacy", wr2, pub2, 2004, "krzyzacy_part1.pdf");
        Ebook eb2 = new Ebook("Pan Tadeusz 2", wr3, pub1, 2021);
        Audiobook ab1 = new Audiobook("fajna ksiazka taka do posluchania", wr3, pub2, 1997, 189, 22);
        
        Library lib1 = new Library();
        lib1.addBook(b1);
        lib1.addBook(eb1);
        lib1.addBook(eb2);
        lib1.addBook(ab1);
        
        lib1.display();
    }
}