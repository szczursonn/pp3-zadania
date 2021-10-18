public class CinemaTicket {
    static String cinemaName = "Multikino";
    String filmName;
    int row;
    int seat;
    double price;
    
    CinemaTicket(String filmName, int row, int seat) {
        this.filmName = filmName;
        this.row = row;
        this.seat = seat;
        if (this.row < 3) this.price = 10.0;
        else this.price = 25.0;
        
    }
    
    void displayTicketData() {
        System.out.println(cinemaName + " : " + filmName);
        System.out.println("row " + row + " , seat " + seat + " , price: " + price);
    }
    
    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("007",2,3);
        ticket1.displayTicketData();
        
        CinemaTicket ticket2 = new CinemaTicket("Gladiator",4,7);
        ticket2.displayTicketData();
    }
}