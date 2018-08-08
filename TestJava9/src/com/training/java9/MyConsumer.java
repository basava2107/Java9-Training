package com.training.java9;
import java.util.*;

@FunctionalInterface
public interface MyConsumer<T> {

	public void show(List<T> list);
	
}
