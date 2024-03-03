package com.byshnev.groceryinformationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@SpringBootApplication
public class GroceryInformationSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GroceryInformationSystemApplication.class, args);
		List<Integer> l = new ArrayList<>();
		l.add(4);
		l.add(3);
		l.add(8);
		l.add(5);
		System.out.println(l);
	}

}
