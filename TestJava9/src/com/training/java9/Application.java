package com.training.java9;

import java.util.*;
import java.util.stream.*;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Customer> custList = new ArrayList<>();
		
		
		Customer ram = new Customer(101, "Ram", 4500);
		Customer shyam = new Customer(102, "Shyam", 14500);
		Customer gan = new Customer(103, "Ganesh", 2400);
		Customer amit = new Customer(104, "Amit", 5200);
		Customer gaurav = new Customer(105, "Gaurav", 3500);
		
		custList = List.of(ram, shyam, gan, amit, gaurav);
		
		//custList.forEach(System.out::println);
		
		List<Customer> pendingAmtGRT5k = custList.stream().filter(eachCustomer -> eachCustomer.getAmountDue()>5000).collect(Collectors.toList());
		
	//	pendingAmtGRT5k.forEach(System.out::println);
		
		/* custList.stream().filter((eachCustomer -> eachCustomer.getCustNumber()>103)).map(
				eachCustomer->eachCustomer.getCustName()).forEach(System.out::println);*/
		
		
		
		 /*MyConsumer<Customer> funcRef = (lambdaSustList) -> {
			 
			 lambdaSustList.forEach(System.out::println);
			 
		 };
		 
		 funcRef.show(custList);*/
		 
		 custList.stream().filter((eachCustomer -> eachCustomer.getCustNumber()>103)).map(
		eachCustomer->eachCustomer.getCustName()).forEach(System.out::println);
		 
	}

}
