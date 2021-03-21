package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsExample {

	public static void main(String[] args) {
		List<String> tan = new LinkedList<>();
		tan.add("sun");
		tan.add("mon");
		tan.add("tue");
		tan.add("wed");
		tan.add("thurs");
		tan.add("fri");
		tan.add("sat");

		
		tan.stream()
		.filter(s -> s.length() < 4)
		.collect(Collectors.toList())
		.forEach(s -> System.out.println(s));
		
		System.out.println(tan.stream().filter(s -> s.length() < 4).collect(Collectors.toList()).getClass());
		System.out.println(tan.stream().filter(s -> s.length() > 4).collect(Collectors.toList()).getClass());
		System.out.println(tan.stream().filter(s -> s.length() < 4).collect(Collectors.toCollection(LinkedList::new)).getClass());
		
		
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        int sum = 0;
        List<Integer> listOfIntegers = listOfStrings.stream()
                                        .mapToInt(Integer::valueOf)
                                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
         
        System.out.println(listOfIntegers);
        
        
        List<String> list = Arrays.asList("5.6", "7.4", "4", 
                "1", "2.3"); 
        System.out.println(list);
        	list.stream().flatMap(num -> Stream.of(num))
        	.forEach(System.out::println); 
        
	}
}
