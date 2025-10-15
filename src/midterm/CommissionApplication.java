/**
 * Midterm - Salary & Commission
 * Student: Sadaf Darwish
 * Student ID: 301493791
 * Course: COMP228 - Java Programming (SEC. 403)
 * Note: Follows updated Part B instructions - show code, then run.
 */

package midterm;

public class CommissionApplication extends Applicant {
    private double grossSales;
    private double commissionRate; // 0..1

    public CommissionApplication(String firstName, String lastName, String socialInsuranceNumber,
                                 double grossSales, double commissionRate) {
        super(firstName, lastName, socialInsuranceNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException("Commission rate must be between 0 and 1 (e.g., 0.2 for 20%).");
        }
        this.commissionRate = commissionRate;
    }

    // earnings = sales * rate
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("CommissionApplication: %s, grossSales=%.2f, commissionRate=%.2f, earnings=%.2f",
                super.toString(), grossSales, commissionRate, earnings());
    }
}
