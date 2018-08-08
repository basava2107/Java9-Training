package com.training;
import com.training.ifaces.Demo;
import java.io.*;
public class Application implements Demo{
	@Override
	public void show() {
		System.out.println("Inside Dhow Method");
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream("abc"));
		
		
		Application app = new Application();
		
		app.show(); // abstract method
		
		
		System.out.println(app.showCity()); // default method
		
		System.out.println(app.showNames()); // default method
		
		
		 FileWriter wr = new FileWriter(new File("File.txt"), true);
		
		try(wr;outObj) {
			wr.write("Hello FileWriting...!!!");
		} catch(Exception e) {
			
		}

	}

}
