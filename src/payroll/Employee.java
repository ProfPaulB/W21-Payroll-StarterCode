package payroll;

/**
 * A class that represents Employee Objects. Employees have a name, a number of hours and an hourlyWage.
 *
 * @author Liz Dancy, 2019
 * @author Paul Bonenfant, Apr 2021
 *
 */
public class Employee {

    private String name;
    private double numHours;
    private double hourlyWage;


    public Employee(String name, double hourlyWage, double numHours) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.numHours = numHours;
    }

    /**
     * A constructor that takes in the Employee's name
     *
     * @param name
     */
    public Employee(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHours(double numHours) {
        this.numHours = numHours;
    }

    public double getHours() {
        return numHours;
    }

    public void setWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getWage() {
        return hourlyWage;
    }

    /**
     * A method to return the pay due to this employee
     *
     * @return the total pay
     */
    public double calculatePay() {
        return numHours * hourlyWage;
    }


    @Override
    public String toString() {
        return "This employee's name is: " + getName();
    }

    @Override
    public boolean equals(Object other) {
        if ((this.getName().equals(((Employee) other).getName()))) {
            return true;
        }
        return false;
    }

    public double getNumHours() {
        return numHours;
    }

    public void setNumHours(double numHours) {
        this.numHours = numHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * A private print method that takes in an Employee and calls the getPayment method on it. It then uses printf to
     * format the output in a professional way.
     *
     */
    public void printStatement() {
        System.out.println(" Employee:" + getName() + " is owed: ");
        System.out.printf("%s%.2f\n", " $", calculatePay());
        System.out.println("**************************************************************");
    }

}
