package com.customException;

class Account {
	private int accid;
	private String name;
	private double balance;
	
	public Account() {
		
	}
	public Account(int accid, String name, double balance) {
		super();
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance+=amount;
		System.out.println("AMount deposited "+amount);
		System.out.println("New balance "+balance);
	}
	
	void withrow(double amount)
	{
		try {
			if((this.balance-amount)<0)
				throw new InsufficientBalanceException("your balance is low "+balance);
			
			balance-=amount;
			System.out.println("Amount withdraw "+amount);
			System.out.println("New balance :"+balance);
		} 
		catch (Exception e) {
		System.out.println(e);
		}
	}
	
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
	}
}

public class Bank {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "nisha", 2000);
		acc1.deposit(1000);
		System.out.println("---------");
		acc1.withrow(1000);
		System.out.println("---------");
		acc1.withrow(3000);

	}

}
