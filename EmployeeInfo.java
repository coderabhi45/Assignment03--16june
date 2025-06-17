//Java Program: Method Overriding with Employee and Manager

package Package07;

public class EmployeeInfo{
    public static void main(String[] args) {

        Employee E = new Employee();
        E.work();

        // Create object of Manager
        Manager M = new Manager();
        M.work();

        // Demonstrating polymorphism
        Employee ERef = new Manager();
        ERef.work();
    }
}

