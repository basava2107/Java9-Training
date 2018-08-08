package com.training.pack1;

public class Customer {

	private int custNumber;
	private String customerName;
	
	public String showCustomerDetails() {
		
		return "name:Rames, amount:500";
		
	}

	/**
	 * @param custNumber
	 * @param customerName
	 */
	public Customer(int custNumber, String customerName) {
		super();
		this.custNumber = custNumber;
		this.customerName = customerName;
	}
	
	
	
	
}
