public class Room {
    int roomNumber;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.beds = 2;
    }
    
    Room(int roomNumber, int beds) {
        this.roomNumber = roomNumber;
        this.beds = beds;
    }
    
    void checkIn(String guestName) {
        if (!this.isOccupied()) {
            this.occupied = true;
            this.guestName = guestName;
        } else {
            System.out.println("Room is already occupied!");
        }
    }
    
    void checkOut() {
        if (this.isOccupied()) {
            this.occupied = false;
            this.guestName = null;
        } else {
            System.out.println("Room is not occupied!");
        }
    }
    
    boolean isOccupied() {
        return this.occupied;
    }
    
    void displayStatus() {
        System.out.println(this.toString());
    }
    
    public String toString() {
        return "Room " + this.roomNumber + " , " + this.beds + " beds, " + (this.isOccupied() ? "occupied by " + guestName : "not occupied");
    }
    
    static void displayRoomReport(Room[] rooms, int roomNumber) {
        for (int i=0;i<rooms.length;i++) {
            if (rooms[i].roomNumber == roomNumber) {
                rooms[i].displayStatus();
                return;
            }
        }
        System.out.println("Room " + roomNumber + " not found!");
    }
    
    static void displayAllRoomsReport(Room[] rooms) {
        for (int i=0;i<rooms.length;i++) {
            rooms[i].displayStatus();
        }
    }
    
    static void displayAllRoomsWithBeds(Room[] rooms, int bedAmount) {
        for (int i=0;i<rooms.length;i++) {
            if (rooms[i].beds == bedAmount) rooms[i].displayStatus();
        }
    }
    
    static void displayAllVacantRooms(Room[] rooms) {
        int vacantAmount = 0;
        for (int i=0;i<rooms.length;i++) {
            if (!rooms[i].isOccupied()) vacantAmount++;
        }
        System.out.println(vacantAmount + " rooms are vacant and " + (rooms.length-vacantAmount) + " rooms are occupied.");
    }
    
    static void displayAllVacantBeds(Room[] rooms) {
        int vacantBedsAmount = 0;
        for (int i=0;i<rooms.length;i++) {
            if (!rooms[i].isOccupied()) vacantBedsAmount+=rooms[i].beds;
        }
        System.out.println(vacantBedsAmount + " vacant beds are available!");
    }
    
    static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1);
        rooms[1] = new Room(2);
        rooms[2] = new Room(3);
        rooms[3] = new Room(4, 3);
        rooms[4] = new Room(5, 3);
        rooms[5] = new Room(6, 1);
        
        rooms[2].checkIn("Maciek");
        rooms[4].checkIn("Jacek");
        
        System.out.println("a) ");
        displayRoomReport(rooms, 2);
        
        System.out.println("b) ");
        displayAllRoomsReport(rooms);    
        
        System.out.println("c) ");
        displayAllRoomsWithBeds(rooms, 3);
        
        System.out.println("d) ");
        displayAllVacantRooms(rooms);
        
        System.out.println("e) ");
        displayAllVacantBeds(rooms);
        
    }
}