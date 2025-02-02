public class HotelBooking {
    

    private String guestName;
    private String roomType;
    private int nights;

    //default constructor
    public HotelBooking() {
        this("ABC", "Supreme", 4);
    }

    //parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy Constructor
    public HotelBooking(HotelBooking h2) {
        this.guestName = h2.guestName;
        this.roomType = h2.roomType;
        this.nights = h2.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + this.guestName + "\nRoom Type: " + this.roomType + "\nNights: " + this.nights);
    }
    
    public String getGuestName() {
        return this.guestName;
    }

    public void setGuestName(String name) {
        this.guestName = name;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return this.nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
    
}
