//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Library library = new Library("Uttara Library", "Dhaka");\
        Library library = new Library();
        library.setLibraryName("Uttara");
        library.setAddress("Dhaka");

        LibraryCard card1 = new LibraryCard("C001","01-01-2026","31-12-2026");
        LibraryCard card2 = new LibraryCard("C002","01-01-2026","31-12-2026");
        LibraryCard card3 = new LibraryCard("C003","01-01-2026","31-12-2026");
        LibraryCard card4 = new LibraryCard("C004","01-01-2026","31-12-2026");
        LibraryCard card5 = new LibraryCard("C005","01-01-2026","31-12-2026");

        Member member1 = new Member(1, "Rahim", "x@gmail.com","01758585858",card1);
        Member member2 = new Member(2, "Kahim", "y@gmail.com","01758535258",card2);
        Member member3 = new Member(3, "Mahim", "z@gmail.com","01758575758",card3);
        Member member4 = new Member(4, "Fahim", "a@gmail.com","01898989989",card4);
        Member member5 = new Member(5, "Nahim", "b@gmail.com","01364646466",card5);

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);
        library.addMember(member4);
        library.addMember(member5);

        System.out.println("--------All Available Member----");
        System.out.println("\n");
        library.printAllMembers();

        System.out.println("---------------Blah Blah Blah -------------------");
        System.out.println(library.findMember(1).getMemberName());


        library.removeMember(2);
        library.removeMember(3);
        System.out.println("After Remove member......");
        library.printAllMembers();



    }
}