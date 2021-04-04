package payroll;

/**
 * A class that represents part-time employees. Part-time employees get an extra 10% of their wage to put towards
 * benefits.
 *
 * @author dancye
 * @author Paul Bonenfant, Apr 2021
 */
public class PartTimeEmployee {

    private String name;
    private double numHours;
    private double hourlyWage;

    public PartTimeEmployee(String name, double numHours, double hourlyWage) {
        this.name = name;
        this.numHours = numHours;
        this.hourlyWage = hourlyWage;
    }

    /**
     * Part-time employees get an extra 10% of their wage to put towards benefits
     *
     * @return the pay
     */
    public double calculatePay() {
        double extra = (numHours * hourlyWage) * 0.1;
        return (numHours * hourlyWage) + extra;
    }
}
