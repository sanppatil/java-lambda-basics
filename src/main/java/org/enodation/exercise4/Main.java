package org.enodation.exercise4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.enodation.exercise3.Person;

public class Main {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("John", "Doe", 45), new Person("Ron", "Smith", 32),
				new Person("Tom", "Hank", 23), new Person("Anglina", "Jolie", 45), new Person("Jack", "Sparrow", 35));

		// Sort list by Last Name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Print all people in list
		System.out.println("Printing all persons....");
		performConditionally(people, (p) -> true, p -> System.out.println(p));

		// Print all people in list where LastName begins with "S"
		System.out.println("Printing all persons where LastName begins with 'S'....");
		performConditionally(people, (p) -> p.getLastName().startsWith("S"), p -> System.out.println(p.getLastName()));

		// Print all people in list where FirstName begins with "J"
		System.out.println("Printing all persons where FirstName begins with 'J'....");
		performConditionally(people, (p) -> p.getFirstName().startsWith("J"), p -> System.out.println(p.getFirstName()));

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}

}
