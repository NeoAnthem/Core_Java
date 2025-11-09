package loanApprovalSystem.derived;

import loanApprovalSystem.base.User;

public class LoanApplicant extends User {
	
    protected double salary;
    
    protected double loanAmount;

    public LoanApplicant(String name, int age, double salary, double loanAmount) {
        super(name, age);
        this.salary = salary;
        this.loanAmount = loanAmount;
    }

    public boolean isEligibleForAmount() {
        return loanAmount <= salary * 10;
    }
}