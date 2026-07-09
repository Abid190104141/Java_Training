public class Employee {

    private  String empId;
    private  String empName;
    private String designation;
    private  String emailAddress;
    private Laptop assignedLaptop;

    public Employee(String empId, String empName, String designation, String emailAddress, Laptop newLaptop) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.emailAddress = emailAddress;
        this.assignedLaptop = newLaptop;
    }

    public Employee() {



    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Laptop getAssignedLaptop() {
        return assignedLaptop;
    }

    public void setAssignedLaptop(Laptop assignedLaptop) {
        this.assignedLaptop = assignedLaptop;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayInfo(){
        System.out.println("-------------------------");
        System.out.println("Employee ID : " +getEmpId());
        System.out.println("Name : " + getEmpName());
        System.out.println("Designation : " + getDesignation());
        System.out.println("Email : " + getEmailAddress());
        System.out.println("\nAssigned Laptop");
        if (assignedLaptop!=null){
            System.out.println(assignedLaptop.getDetails());
        }
        else {
            System.out.println("No Laptop Assigned!");
        }
    }






}
