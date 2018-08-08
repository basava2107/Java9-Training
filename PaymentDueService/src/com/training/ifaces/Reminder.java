package com.training.ifaces;

import java.util.ServiceLoader;
import java.util.*;

public interface Reminder {

	
	public String reminder(String msg);
	
	public static List<Reminder> getInstance(){ 
	
	
	ServiceLoader<Reminder> services = ServiceLoader.load(Reminder.class);
	
	List<Reminder> list = new ArrayList<>();
	
	services.iterator().forEachRemaining(list::add);
	
	return list;
	}
}
