package loanApprovalSystem.derived;

public class VerifiedApplicant extends LoanApplicant {
	
    private int creditScore;

    public VerifiedApplicant(String name, int age, double salary, double loanAmount, int creditScore) {
        super(name, age, salary, loanAmount);
        this.creditScore = creditScore;
    }

    public void checkLoanApproval() {
        System.out.println("\nApplicant: " + name);

        if (!isAdult()) {
            System.out.println("REJECTED: Applicant is not an adult (age < 18)");
            return;
        }

        if (!isEligibleForAmount()) {
            System.out.println("REJECTED: Requested loan amount exceeds salary limit");
            return;
        }

        if (creditScore < 700) {
            System.out.println("REJECTED: Credit score below 700");
            return;
        }

        System.out.println("APPROVED: Loan approved successfully!");
    }
}