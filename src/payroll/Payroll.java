package payroll;

/**
 * A class that models the Payroll Application. Used as the starting code for Exercise 4
 *
 * @author: Liz Dancy
 * @author by: Hassan
 * @author by: Paul Bonenfant, Apr 2021
 *
 */
import java.util.Scanner;

public class Payroll {

    private Object employees[] = new Object[100];//the array to hold Employee Objects

    /**
     * The main method where we create an instance of the payroll and then call the private run method on it. We also
     * catch our Exceptions here from the Employee class.
     */
    public static void main(String[] args) {
        try {
            Payroll app = new Payroll();
            app.run();
        } catch (NumberFormatException e) {
            System.out.println("A number format is incorrect " + e.getMessage() + " Please ensure hours and wage are entered as numbers and not words");
        } catch (Exception e) {
            System.out.println("An exception was caught while trying to process employees: " + e.getMessage());
        }
    }//end main method

    /**
     * A private run method that prompts the user for input and adds each Employee to the array. Finally, we call the
     * print method to print out the payroll for each employee and the total.
     */
    private void run() {

        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;//to keep track of whether the user wants to continue

        System.out.println("Welcome to the Payroll Application.");

        int numEmployees = 0;
        while (shouldContinue) {
            System.out.println("Please enter the Employee's name: ");
            String name = sc.nextLine();
            
            System.out.println("Please enter the Employee's number of hours worked as a number: ");
            int numHours = Integer.parseInt(sc.nextLine());
            
            System.out.println("Please enter the Employee's hourly wage: ");
            double wage = Double.parseDouble(sc.nextLine());
            
            System.out.println("Is this employee a manager? Type yes or no");
            String manager = sc.nextLine();
            
            if (manager.equals("yes")) {
                Manager man = new Manager(name, numHours, wage);
                employees[numEmployees] = man;
            } else {
                System.out.println("Is this part-time Employee?");
                String partTime = sc.nextLine();
                
                if (partTime.equals("yes")) {
                    PartTimeEmployee partEmp = new PartTimeEmployee(name, numHours, wage);//create a new Employee with the given info
                    employees[numEmployees] = partEmp;//add the new employee to the array
                } else {
                    System.out.println("Creating Employee");
                    Employee emp = new Employee(name, numHours, wage);
                    employees[numEmployees] = emp;
                }
            }

            System.out.println("Would you like to enter another employee (yes or no)?");
            String yesOrNo = sc.nextLine();
            
            if (yesOrNo.equalsIgnoreCase("yes")) {
                shouldContinue = true;
            } else {
                shouldContinue = false;
            }
            numEmployees++;
        }//done entering Employees, now print out the pay for each employee, and then the pay for all

        System.out.println("Now printing pay for each employee and "
                + "then pay for all");

        /*
        Add code to display pay for EACH employee. 
        Also display the total pay out for ALL employees.
         */
    }
}
