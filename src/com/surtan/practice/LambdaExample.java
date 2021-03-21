package com.surtan.practice;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
	
	
	//-Functional interface - interface that has only one method.
	//-inbuilt functional interfaces : predicate,consumers etc.
	//-All functional interfaces can be replaced by a lambda expression.
	//-lambda expressions are different from anonymous inner class. how? - the number of inner
	// anonymous class present in a java class, then .class files with same count will be present.
	// But same is not the case with lambda.
	//-Lambda works on invoke dynamic concept.

	
	
	public static void main(String[] args) {
	
		
		Thread thread = new Thread(() -> System.out.println("heyhey"));
		
		List<Integer> ar = Arrays.asList(10,30,20,60,90,49);
		
				
		long count = ar.stream().filter(i->i%10==0)
							   .count();
		System.out.println(count);
		

	}

}
