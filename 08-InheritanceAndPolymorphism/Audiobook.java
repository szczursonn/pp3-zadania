public class Audiobook extends Book {
    
    int durationMinutes;
    int durationSeconds;
    
    Audiobook(String title, Writer author, Publisher publisher, int publicationYear, int durationMinutes, int durationSeconds) {
        super(title, author, publisher, publicationYear);
        setDurationMinutes(durationMinutes);
        setDurationSeconds(durationSeconds);
    }
    
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    
    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    public int getDurationSeconds() {
        return durationSeconds;
    }
    
    public String getDuration() {
        return getDurationMinutes() + ":" + getDurationSeconds();
    }
    
    public void display() {
        System.out.println(getTitle() + ", by " + getAuthor() + ", " + getPublicationYear() + ", Duration : " + getDuration() + ", Wydawnictwo " + getPublisher());
    }
    
}