package payroll;

import java.util.Scanner;

/**
 * A Manager is an Employee. This class shows the inheritance relationship discussed in class
 *
 * @author Liz Dancy, 2019
 * @author Paul Bonenfant, Apr 2021
 */
public class Manager extends Employee {

    private double bonus;//the amount of bonus they should receive

    public Manager(String name, double hours, double wage) {
        super(name);
        this.setHourlyWage(wage);
        this.setHours(hours);
        
        System.out.println("Please enter a bonus for the manager");
        Scanner sc = new Scanner(System.in);
        double bonus = sc.nextDouble();
        this.bonus = bonus;
    }

    /**
     * Accessors and mutators for bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    /**
     * A method that calculates the pay for a manager, Note that this is overriden from the base class.
     */
    public double calculatePay(double bonus) {
        return getWage() * getHours() + bonus;
    }

    /**
     * A method to print the manager's statement to the console
     */
    public void printStatement() {
        System.out.println(" Manager:" + getName() + " is owed: ");
        System.out.printf("%s%.2f\n", " $", calculatePay());
        System.out.println("**************************************************************");
    }
}
