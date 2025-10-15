/**
 * Midterm - Salary & Commission
 * Student: Sadaf Darwish
 * Student ID: 301493791
 * Course: COMP228 - Java Programming (SEC. 403)
 * Note: Follows updated Part B instructions - show code, then run.
 */

package midterm;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Demo banner for console clarity
        System.out.println("=== Midterm Salary & Commission Demo ===");

        // 3 HourlyApplicant objects
        HourlyApplicant h1 = new HourlyApplicant("Sadaf", "Darwish", "123-456-789", 25.00, 38);
        HourlyApplicant h2 = new HourlyApplicant("Alex", "Kim", "234-567-890", 22.50, 42);
        HourlyApplicant h3 = new HourlyApplicant("Maria", "Lopez", "345-678-901", 30.00, 50);

        // 3 CommissionApplication objects
        CommissionApplication c1 = new CommissionApplication("John", "Singh", "456-789-012", 8000, 0.12);
        CommissionApplication c2 = new CommissionApplication("Priya", "Patel", "567-890-123", 15000, 0.08);
        CommissionApplication c3 = new CommissionApplication("Hassan", "Ali", "678-901-234", 12000, 0.10);

        // Polymorphic list of base type allows treating all subclasses uniformly
        List<Applicant> applicants = new ArrayList<>();
        applicants.add(h1); applicants.add(h2); applicants.add(h3);
        applicants.add(c1); applicants.add(c2); applicants.add(c3);

        // Loop uses dynamic dispatch to call each subclass's overridden earnings()
        for (Applicant a : applicants) {
            System.out.println(a.toString());
        }

        // Example: basic validation demo (uncomment to test exceptions)
        // new HourlyApplicant("", "Test", "111-111-111", 10, 10); // should throw
    }
}
