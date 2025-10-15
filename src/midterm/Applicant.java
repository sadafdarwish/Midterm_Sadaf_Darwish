/**
 * Midterm - Salary & Commission
 * Student: Sadaf Darwish
 * Student ID: 301493791
 * Course: COMP228 - Java Programming (SEC. 403)
 * Note: Follows updated Part B instructions - show code, then run.
 */

package midterm;

public abstract class Applicant {
    // Abstract base class for all applicants
    // Holds identity fields common to Hourly and Commission applicants.

    private String firstName;
    private String lastName;
    private String socialInsuranceNumber; // SIN

    public Applicant(String firstName, String lastName, String socialInsuranceNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialInsuranceNumber(socialInsuranceNumber);
    }

    // --- Validation helpers ---
    protected static void requireNonEmpty(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty.");
        }
    }

    // --- Getters & setters ---
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        requireNonEmpty(firstName, "First name");
        this.firstName = firstName.trim();
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        requireNonEmpty(lastName, "Last name");
        this.lastName = lastName.trim();
    }

    public String getSocialInsuranceNumber() { return socialInsuranceNumber; }
    public void setSocialInsuranceNumber(String socialInsuranceNumber) {
        requireNonEmpty(socialInsuranceNumber, "Social insurance number");
        this.socialInsuranceNumber = socialInsuranceNumber.trim();
    }

    // --- Behavior ---
    /** Calculate this applicant's earnings (weekly). */
    public abstract double earnings();

    // Provide a readable summary used by Driver printing
    @Override
    public String toString() {
        return String.format("%s %s (SIN: %s)",
                firstName, lastName, socialInsuranceNumber);
    }
}
