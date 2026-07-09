public class Member {

  private  int memberId;
  private  String memberName;
  private String email;
  private String phoneNumber;
  private LibraryCard libraryCard;

    public Member(int memberId, String memberName, String email, String phoneNumber, LibraryCard libraryCard) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.libraryCard = libraryCard;
    }

    public Member() {

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }


}
