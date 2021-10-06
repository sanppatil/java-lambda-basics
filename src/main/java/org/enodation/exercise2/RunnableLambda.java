package org.enodation.exercise2;

public class RunnableLambda {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I'm inside thread " + Thread.currentThread().getName());
			}
		});
		thread1.start();

		// Example shows lambda are completely backward compatible.
		// Here, Thread class is available since 1.0 and lambda are introduced in 1.8
		Thread thread2 = new Thread(() -> System.out.println("I'm inside thread " + Thread.currentThread().getName()));
		thread2.start();
	}

}
