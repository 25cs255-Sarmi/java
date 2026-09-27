

public class employeee {
    int id;
    String name;
    double salary;

    // Constructor
    public employeee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs." + salary);
    }
}
