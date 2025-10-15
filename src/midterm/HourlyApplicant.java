package midterm;

/**
 * Midterm - Salary & Commission
 * Student: Sadaf Darwish
 * Student ID: 301493791
 * Course: COMP228 - Java Programming (SEC. 403)
 * Note: Follows updated Part B instructions - show code, then run.
 */
public class HourlyApplicant extends Applicant {
    private double wage;   // hourly wage
    private double hours;  // weekly hours

    public HourlyApplicant(String firstName, String lastName, String socialInsuranceNumber,
                           double wage, double hours) {
        super(firstName, lastName, socialInsuranceNumber);
        setWage(wage);
        setHours(hours);
    }

    public double getWage() { return wage; }
    // Validate wage must be positive
    public void setWage(double wage) {
        if (wage <= 0) {
            throw new IllegalArgumentException("Wage must be > 0.");
        }
        this.wage = wage;
    }

    public double getHours() { return hours; }
    // Validate hours within a sensible weekly range
    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be between 0 and 168.");
        }
        this.hours = hours;
    }

    /**
     * Earnings with standard overtime rule.
     * Overtime: pay 1.5x for hours beyond 40 in a week.
     */
    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            double overtime = hours - 40;
            return (40 * wage) + (overtime * wage * 1.5);
        }
    }

    // Provide a readable summary used by Driver printing
    @Override
    public String toString() {
        return String.format("HourlyApplicant: %s, wage=%.2f, hours=%.2f, earnings=%.2f",
                super.toString(), wage, hours, earnings());
    }
}
