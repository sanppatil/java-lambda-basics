package org.enodation.exercise3.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.enodation.exercise3.Person;

public class Main {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("John", "Doe", 45), new Person("Ron", "Smith", 32),
				new Person("Tom", "Hank", 23), new Person("Anglina", "Jolie", 45), new Person("Jack", "Sparrow", 35));

		// Sort list by Last Name (Using functional interface - Comparator)
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Print all people in list (Using functional interface - Predicate)
		System.out.println("Printing all persons....");
		printConditionally(people, (p) -> true);

		// Print all people in list where LastName begins with "S" (Using functional interface - Predicate)
		System.out.println("Printing all persons where LastName begins with 'S'....");
		printConditionally(people, (p) -> p.getLastName().startsWith("S"));

		// Print all people in list where FirstName begins with "J" (Using functional interface - Predicate)
		System.out.println("Printing all persons where FirstName begins with 'J'....");
		printConditionally(people, (p) -> p.getFirstName().startsWith("J"));

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person))
				System.out.println(person.toString());
		}
	}



}
