package loanApprovalSystem.main;

import loanApprovalSystem.derived.*;

public class MainClass {
    public static void main(String[] args) {
    	
        // Create 5 verified applicants
        VerifiedApplicant[] applicants = {
            new VerifiedApplicant("Alice", 25, 50000, 300000, 720),
            new VerifiedApplicant("Bob", 17, 40000, 200000, 710),
            new VerifiedApplicant("Charlie", 30, 25000, 400000, 750),
            new VerifiedApplicant("Diana", 28, 60000, 200000, 650),
            new VerifiedApplicant("Ethan", 35, 80000, 500000, 800)
        };

        // Loop through applicants
        for (VerifiedApplicant applicant : applicants) {
            applicant.checkLoanApproval();
        }
    }
}