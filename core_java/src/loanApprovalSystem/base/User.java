package loanApprovalSystem.base;

public class User {
	
    protected String name;
    
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}