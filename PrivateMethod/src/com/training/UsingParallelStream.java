package com.training;
import java.util.stream.*;
import java.util.*;
public class UsingParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> markList = List.of(200,250,300,123,523,0,124,512,83);
		
	Optional<Integer> maxMark  = markList.parallelStream().reduce((e1, e2) -> e1 > e2 ? e1 : e2);
	
	if(maxMark.isPresent()){
	System.out.println("Maximum mark " + maxMark);
	}
	
	markList.stream().takeWhile(e -> e!=0 ).forEach(System.out::println);
	
	System.out.println("************** Drop While *************");
	
	markList.stream().dropWhile(e -> e!=0 ).forEach(System.out::println);
	
	}
}
