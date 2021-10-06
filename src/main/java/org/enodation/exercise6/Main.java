package org.enodation.exercise6;

import java.util.function.IntConsumer;

public class Main {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		// b is in closing scope. should be final or effectively final
		doProcess(a, a1 -> System.out.println(a1 + b));
	}

	public static void doProcess(int a, IntConsumer intConsumer) {
		intConsumer.accept(a);
	}

}
