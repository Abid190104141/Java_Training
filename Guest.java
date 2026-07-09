public class Guest {

 private  String guestId;
 private String  guestName;
    private String  phoneNum;
    private String  email;

    public Guest(String guestId, String guestName, String phoneNum, String email) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    public Guest() {

    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
