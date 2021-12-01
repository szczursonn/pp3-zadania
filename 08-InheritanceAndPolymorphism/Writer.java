public class Writer {
    private String firstName;
    private String lastName;
    private String genre;
    
    Writer(String firstName, String lastName, String genre) {
        setFirstName(firstName);
        setLastName(lastName);
        setGenre(genre);
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    
    public String toString() {
        return getName();
    }
}