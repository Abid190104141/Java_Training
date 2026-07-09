import java.util.ArrayList;

public class Company {

private  String name;
private String address;
private ArrayList<Employee>employees;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
    }
    public Company() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean addemployee(Employee newEmployee){

        if(newEmployee.getAssignedLaptop() == null){
            System.out.println("Error: Cannot add employee without an assigned laptop");
            return false;
        }
        for (Employee employee : employees){

            if(employee.getAssignedLaptop()!= null){
                if(
                        employee.getAssignedLaptop()
                                .getLaptopId()
                                .equalsIgnoreCase(newEmployee.getAssignedLaptop()
                                        .getLaptopId())){
                    System.out.println("Error: Laptop " + newEmployee.getAssignedLaptop().getLaptopId()+" is already assigned");
                    return false;
                }
            }
        }
        employees.add(newEmployee);
        return true;
    }

    public Employee searchEmployee(String employeeId){
        for (Employee employee : employees){
            if(employee.getEmpId().equals(employeeId)){
                return employee;
            }
        }
        return null;
    }

    public boolean removeEmployee(String employeeId){
        Employee employee = searchEmployee(employeeId);
        if (employee!=null){
            employees.remove(employee);
            return true;
        }
        return false;
    }

    public void displayCompanyDashboard(){
        System.out.println("=================");
        System.out.println("Company: " + name);
        System.out.println("Address: " +address );
        System.out.println("=================");

        if (employees.isEmpty()){
            System.out.println("No Employee Register in the system!");
            return;
        }
        for( Employee employee : employees){
            employee.displayInfo();
        }

    }


}
