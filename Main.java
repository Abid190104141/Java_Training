//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Room room1 = new Room();
        room1.setRoomNum("R001");
        room1.setRoomType("Delux");
        room1.setRent("5000");
        System.out.println(room1.getRoomNum());
        System.out.println(room1.getRoomType());
        System.out.println(room1.getRent());

        Hotel hotel1 = new Hotel();
        hotel1.setHotelName("Cox's-Today");
        hotel1.setHotelAddress("Cox's-Bazar");
       hotel1.addRooms(room1);

        Booking booking1 = new Booking("101","Single","05-07-2026","09-07-2026",true);
        booking1.newBooking("101");


        Guest guest1 = new Guest();
        guest1.setGuestId("111");
        guest1.setGuestName("Rahim");
        guest1.setEmail("rahim@gmail.com");
        guest1.setPhoneNum("01323456789");

        System.out.println(guest1.getGuestId());
        System.out.println(guest1.getGuestName());
        System.out.println(guest1.getEmail());
        System.out.println(guest1.getPhoneNum());



    }






}