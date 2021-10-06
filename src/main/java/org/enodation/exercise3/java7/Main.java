package org.enodation.exercise3.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.enodation.exercise3.Person;

public class Main {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("John", "Doe", 45), new Person("Ron", "Smith", 32),
				new Person("Tom", "Hank", 23), new Person("Anglina", "Jolie", 45), new Person("Jack", "Sparrow", 35));

		// Sort list by Last Name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		// Print all people in list
		System.out.println("Printing all persons....");
		printAll(people);

		// Print all people in list where LastName begins with "S"
		System.out.println("Printing all persons where LastName begins with 'S'....");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("S");
			}
		});

		// Print all people in list where FirstName begins with "J"
		System.out.println("Printing all persons where FirstName begins with 'J'....");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("J");
			}

		});

	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person.toString());
		}
	}

	interface Condition {
		boolean test(Person person);
	}

}
