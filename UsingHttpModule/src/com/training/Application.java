package com.training;

import com.training.service.UserAPI;

public class Application {

	public static void main(String[] args) {
		
		
		try {
			
			String data =  "{ \"id\": 1, \r\n " +
				   " \"name\": \"Leanne Graham\"}" ;
			
			UserAPI service = new UserAPI();
			
			service.findAll();
			
			service.findAsync();
			
			//service.add(data);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
