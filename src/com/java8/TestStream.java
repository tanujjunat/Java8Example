package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class TestStream {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> listOfIntegers = listOfStrings.stream()
                                        .mapToInt(Integer::valueOf)
                                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
         
        //System.out.println(listOfIntegers);
        
        
        List<Integer> inte = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(inte);
        List<Integer> st = inte.stream()
        		.map(i -> i*2)
        		.collect(Collectors.toList());

        System.out.println(st);
        
        List<Integer> inter = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> st1 = inter.stream()
        	.map(num -> CompletableFuture.supplyAsync(() -> num).thenApply(i -> i*i))
        	.mapToInt(fb -> fb.join())
        	.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(st1);
        
        List<CompletableFuture<Integer>> intNumber = inter.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber1(num)))
        		   .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        intNumber.stream().forEach(pt -> pt.thenAccept(System.out::println));
        
	}
	
	private static CompletableFuture<Integer> getNumbers(int num) {
		return CompletableFuture.supplyAsync(() -> num).thenApply(i -> i*i);
	}
	
	private static Integer getNumber1(int num)
	{
		return num*num;
	} 

}
