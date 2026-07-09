import java.util.ArrayList;

public class Library {

    private String libraryName;
    private String address;
    private ArrayList<Member> members;

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
    }

public Library() {
members = new ArrayList<>();}


    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addMember(Member member) {
        members.add(member);

    }

    public Member findMember(int memberId) {
        for (Member member : members) {
            if (member.getMemberId()==memberId){
                return member;
            }
        }
        return null;

    }


    public String removeMember(int memberId){

        Member removeMember = findMember(memberId);
        if (removeMember!=null){
            members.remove(removeMember);
            return "Member removed Successfully!!!";

        }else
        {
            return "Member not found!!!";

        }



    }


    public void printAllMembers(){

        for (Member member:members){

            System.out.println("Library Name: "+this.getLibraryName());
            System.out.println("Member ID: "+ member.getMemberId());
            System.out.println("Member Name: "+ member.getMemberName());
            System.out.println("Member Email: "+member.getEmail());
            System.out.println("Member PhoneNo: "+member.getPhoneNumber());
            System.out.println("------Library-------");
            LibraryCard libraryCard = member.getLibraryCard();

            if(libraryCard!=null){
                System.out.println("Card Number: "+libraryCard.getCardNumber());
                System.out.println("Issue Date: " +libraryCard.getIssueDate());
                System.out.println("Expiry Date: "+libraryCard.getExpiryDate());

            }
            else {
                System.out.println("No Library card for this member.");
            }


        }


    }
}
