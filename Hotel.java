import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private String hotelAddress;
    private ArrayList<Room> rooms;

    public Hotel(String hotelName, String hotelAddress) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
    }

    public Hotel() {

        rooms = new ArrayList<>();

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void addRooms(Room room) {

        System.out.println(" Room addded successfully :" +rooms.add(room));

    }



}
