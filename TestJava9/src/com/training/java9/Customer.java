package com.training.java9;

public class Customer {

	private long custNumber;
	private String custName;
	private double amountDue;
	/**
	 * @return the custNumber
	 */
	public long getCustNumber() {
		return custNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custNumber=" + custNumber + ", custName=" + custName + ", amountDue=" + amountDue +"]";
	}
	/**
	 * @param custNumber the custNumber to set
	 */
	public void setCustNumber(long custNumber) {
		this.custNumber = custNumber;
	}
	public Customer(long custNumber, String custName, double amountDue) {
		super();
		this.custNumber = custNumber;
		this.custName = custName;
		this.amountDue = amountDue;
	}
	/**
	 * @return the amountDue
	 */
	public double getAmountDue() {
		return amountDue;
	}
	/**
	 * @param amountDue the amountDue to set
	 */
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	
}
