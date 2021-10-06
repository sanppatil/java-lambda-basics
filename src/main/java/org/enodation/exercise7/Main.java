package org.enodation.exercise7;

import java.util.function.IntConsumer;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();

		main.doProcess(10, new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println(value);
				System.out.println(this);	// This code is working due to inner anonymous class. Its using this reference for Main class
			}			
		});

		/*
		main.doProcess(10, num -> {
			System.out.println(num);
			System.out.println(this);	// This code will break as we lambda is using this reference of static main method
		});
		*/
	}

	public void doProcess(int a, IntConsumer intConsumer) {
		intConsumer.accept(a);
	}

	public String toString() {
		return "Reference to Main..";
	}

}
