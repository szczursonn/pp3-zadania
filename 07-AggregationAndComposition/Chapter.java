public class Chapter {
    private String title;
    private int numberOfPages;
    private int startingPageNumber;
    
    Chapter(String title, int numberOfPages, int startingPageNumber) {
        setTitle(title);
        setNumberOfPages(numberOfPages);
        setStartingPageNumber(startingPageNumber);
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    public void setStartingPageNumber(int startingPageNumber) {
        this.startingPageNumber = startingPageNumber;
    }
    public int getStartingPageNumber() {
        return startingPageNumber;
    }
}