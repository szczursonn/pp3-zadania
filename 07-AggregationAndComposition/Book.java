import java.util.ArrayList;

public class Book {
    private String title;
    private String ISBN;
    private Writer author;
    private ArrayList<Chapter> chapters;
    
    Book(String title, Writer author, String ISBN) {
        setTitle(title);
        setAuthor(author);
        setISBN(ISBN);
        this.chapters = new ArrayList<Chapter>();
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }
    
    public void setAuthor(Writer author) {
        this.author = author;
    }
    public Writer getAuthor() {
        return author;
    }
    
    public void addChapter(Chapter chapter) {
        getChapters().add(chapter);
    }
    public ArrayList<Chapter> getChapters() {
        return chapters;
    }
    public int getChapterAmount() {
        return getChapters().size();
    }
    public void removeChapter(String chapterTitle) {
        for (Chapter chapter: getChapters()) {
            if (chapter.getTitle() == chapterTitle) {
                getChapters().remove(chapter);
                break;
            }
        }
    }
    
    public void displayInfo() {
        System.out.println(getTitle() + ", " + getAuthor().getName() + ", ISBN: " 
        + getISBN() + ", " + getChapterAmount() + " chapters");
        for (Chapter chapter: getChapters()) {
            System.out.println("p." + chapter.getStartingPageNumber() + " : " + chapter.getTitle());
        }
    }
    
    public static void main() {
        Writer w1 = new Writer("Adam Mickiewicz", 57, true);
        Book b1 = new Book("Pan Tadeusz", w1, "9788307033419");
        Book b2 = new Book("Dziady czesc IV", w1, "9785042610066");
        Bookcase bc1 = new Bookcase();
        bc1.addBook(b1);
        bc1.displayInfo();
        bc1.addBook(b2);
        bc1.displayInfo();
        bc1.removeBook("Pan Tadeusz");
        bc1.displayInfo();
        
        Chapter ch1 = new Chapter("rozdzial_1",90, 0);
        Chapter ch2 = new Chapter("rozdzial_2",65, 91);
        b2.addChapter(ch1);
        b2.addChapter(ch2);
        bc1.displayInfo();
    }
}