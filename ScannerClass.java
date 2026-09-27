import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        employeee emp = new employeee(id, name, salary);

        emp.displayEmployee();

        sc.close();
    }
}
