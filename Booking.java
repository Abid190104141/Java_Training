import java.util.ArrayList;

public class Booking {

    private  String bookingId;
    private ArrayList<Guest> guests;
    private  String assignedRoom;
    private String chkInDate;
    private  String chkOutDate;
    private boolean bbokingStatus;

    public Booking(String bookingId,String assignedRoom, String chkInDate, String chkOutDate, boolean bokingStatus) {
        this.bookingId = bookingId;
        this.assignedRoom = assignedRoom;
        this.chkInDate = chkInDate;
        this.chkOutDate = chkOutDate;
        this.bbokingStatus = bbokingStatus;
    }



    public void newBooking(String bookingId){

        this.bookingId = bookingId;


  }

  public void viewDetails(){

  }

  public Booking searchBookingByBookingId(String bookingId){


      return null ;
  }

public String cancelBooking(String bookingId){

        Booking booking = searchBookingByBookingId(bookingId);
        if (booking!=null){
            return "Booking  Can remove successfuuly";


    }else{

            return "Booking id not exitst";

        }



}




}
