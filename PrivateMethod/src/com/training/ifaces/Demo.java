package com.training.ifaces;

public interface Demo {

	public abstract void show();
	
	public default String showNames() {
		
		String name = "Wells Fargo";
		
		return "Hello From Default Method" + getLength(name);
	}
	
	
	public default String showCity() {
		String city = "Bengaluru";
		return "Hi Bengaluru" + getLength(city);
		
	}
	
	private int getLength(String msg) {
		
		
		return msg.length();
	}
}
