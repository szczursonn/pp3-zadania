// 14.
public class Book
{
    String name;
    String authorName;
    int currentPage;
    int pageAmount;
    
    void nextPage() {
        if (currentPage == pageAmount) {
            System.out.println("You've reached the end of the book!");
        } else {
            currentPage++;
            System.out.println("You are now on page " + currentPage);
        }
    }
    
    void previousPage() {
        if (currentPage == 0) {
            System.out.println("You're at the beginning of the book!");
        } else {
            currentPage--;
            System.out.println("You are now on page " + currentPage);
        }
    }
    
    void displayBookInfo() {
        System.out.println(name + ", by " + authorName + ", " + pageAmount + " pages long.");
    }
}
