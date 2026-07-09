public class Room {

    private String roomNum;
    private  String roomType;
    private  String Rent;

    public Room(String roomNum, String roomType, String rent) {
        this.roomNum = roomNum;
        this.roomType = roomType;
        Rent = rent;
    }

    public Room() {

    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRent() {
        return Rent;
    }

    public void setRent(String rent) {
        Rent = rent;
    }
}
