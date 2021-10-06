package org.enodation.exercise1;

public class Arithmetic {

	public static void main(String[] args) {

		// Traditional object oriented approach
		Math addition = new SimpleAddition();
		System.out.println(addition.add(25, 45));

		// Using anonymous inner Class
		Math anonymousInnnerClassAddition = new Math() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(anonymousInnnerClassAddition.add(25, 45));

		// Using multiple line lambda
		Math lambdaAddition1 = (int n1, int n2) -> {
			int result = n1 + n2;
			return result;

		};
		System.out.println(lambdaAddition1.add(25, 45));

		// Using single-line lambda
		Math lambdaAddition = (n1, n2) -> n1 + n2;
		System.out.println(lambdaAddition.add(25, 45));

		// Passing lambda as argument (Type inference)
		doArithmetic((n1, n2) -> n1 + n2);

	}

	public static int doArithmetic(Math math) {
		return math.add(25, 45);
	}

}
