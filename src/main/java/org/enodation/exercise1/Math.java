package org.enodation.exercise1;

public interface Math {

	public int add(int num1, int num2);

	// Default methods are okay to be part functional interface
	public default int subtract(int num1, int num2) {
		return num1 - num2;
	}

}