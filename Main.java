import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Company company = new Company("SI Dev LTD.", "Dhaka");
        company.addemployee(new Employee("EMP001","Rahim",
                "Software Engineer 1","a@a.com",
                new Laptop("LP001","Dell","Latitude",1 )));

        company.addemployee(new Employee("EMP002", "Sahim",
                "Software Engineer 2","b@a.com",
                new Laptop("LP002","Dell","Latitude",2)));
        company.addemployee(new Employee("EMP003","Bahim",
                "Software Engineer 3","c@a.com",
                new Laptop("LP003","Dell","Latitude",3)));

        Scanner userChoice = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Employee Management System");
            System.out.println("1. View Company Dashboard");
            System.out.println("2. Search Employee By ID");
            System.out.println("3. Remove Employee");
            System.out.println("4. Register New Employee");
            System.out.println("5. Exit");
            choice = userChoice.nextInt();
            userChoice.nextLine();

            switch (choice){
                case 1: company.displayCompanyDashboard();
                break;
                case 2:
                    System.out.println("Enter Employee Id to search: ");
                    String searchId = userChoice.nextLine();
                    Employee found = company.searchEmployee(searchId);

                    if (found!=null){
                        found.displayInfo();
                    }
                    else {
                        System.out.println("Employee not found!");
                    }

                case 3:
                    System.out.println("Emter Employee ID to Delete: ");
                    String removeId = userChoice.nextLine();
                    if(company.removeEmployee(removeId)){
                        System.out.println("Employee Deleted Successdfully");
                    }
                    else{
                        System.out.println("Employee Not founs");
                    }
                case 4:
                    System.out.println("Reister New Employee");String employeeId = userChoice.nextLine();
                    System.out.println("Employee Id : ");String employeeName = userChoice.nextLine();
                    System.out.println("Employee Name : ");String employeeDesignation = userChoice.nextLine();
                    System.out.println("Enter Email"); String email = userChoice.nextLine();

                    System.out.println("\nAssigned Laptop");
                    System.out.println("Laptop Id: ");String laptopId= userChoice.nextLine();
                    System.out.println("Brand: ");String brand = userChoice.nextLine();
                    System.out.println("Model: ");String model = userChoice.nextLine();
                    System.out.println("Serial Number: ");int serialNo = userChoice.nextInt();

                    Laptop newLaptop = new Laptop(laptopId, brand, model, serialNo);
                    Employee newEmployee = new Employee(employeeId, employeeName, employeeDesignation, email, newLaptop);
                    if (company.addemployee(newEmployee)){
                        System.out.println("Registration Successful!");
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Selection! Selects from 1 to 5!");



            }


        }
        while(choice!=5);
        userChoice.close();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}