package com.surtan.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;


public class SapientHiring {
	
	public static void main(String[] args) {
		try {
			Map<String, Integer> cityMap = new LinkedHashMap<>();
			List <City> cityData = new ArrayList<City>();
			Stream<String> lines= Files.lines(Paths.get("src/com/surtan/practice/tan.txt"));
			//lines.map(e->e.split("="))
			  //   .forEach((a) -> cityMap.put(a[0], Integer.parseInt(a[1])));
			lines.map(e -> e.split("-"))
				.forEach(a -> cityData.add(new City(a[2], a[3], a[1])));
			System.out.println(cityData);
			
			cityMap.values().stream();			
			//cityMap.forEach((key, value) -> System.out.println(key +"::**" + value));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
