package com.training.apps;
import java.lang.reflect.*;
import java.util.Map;
import java.util.HashMap;

public class Reflector {

	public static Map<String, Object> getProperties(Object object) throws
	IllegalAccessException {
	
		try {
	Class<?> theClass = object.getClass();

	Field[] declaredFields = theClass.getDeclaredFields();

	Map<String, Object> fieldsMap = new HashMap<>();

	for (Field declaredField : declaredFields) {

	declaredField.setAccessible(true);

	Object o = declaredField.get(object);

	fieldsMap.put(declaredField.getName(), o);

	}

	return fieldsMap;
	
	}
	
		catch(Exception e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
