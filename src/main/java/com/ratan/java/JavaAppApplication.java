package com.ratan.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAppApplication {

	public static void main(String[] args) {
		getStatus();
		List<String> myList = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		Boolean remove = true;
		greet(myList, remove);
		SpringApplication.run(JavaAppApplication.class, args);
	}

	static void getStatus() {
		System.out.println("Something");
	}

	static void greet(List<String> list, Boolean remove) {
		System.out.println(remove);

		List<String> mySortedList;

		if (remove) {
			// Remove duplicates and sort by length
			mySortedList = list.stream()
					.distinct()
					.sorted(Comparator.comparing(String::length))
					.collect(Collectors.toList());
		} else {
			// Just sort by length, keep duplicates
			mySortedList = list.stream()
					.sorted(Comparator.comparing(String::length))
					.collect(Collectors.toList());
		}

		System.out.println(mySortedList);
	}

}
