public class Ebook extends Book {
    
    String fileName;
    
    Ebook(String title, Writer author, Publisher publisher, int publicationYear, String fileName) {
        super(title, author, publisher, publicationYear);
        setFileName(fileName);
    }
    
    Ebook(String title, Writer author, Publisher publisher, int publicationYear) {
        super(title, author, publisher, publicationYear);
        setFileName(Ebook.generateFileName(title));
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }
    
    public void display() {
        System.out.println(getTitle() + ", by " + getAuthor() + ", " + getPublicationYear() + ", Filename : " + getFileName() + ", Wydawnictwo " + getPublisher());
    }
    
    public static String generateFileName(String bookTitle) {
        return bookTitle.toLowerCase().replace(" ","_") + ".pdf";
    }
}