package com.amit;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample2 {

	private final ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {

		ReentrantLockExample2 example = new ReentrantLockExample2();

		Runnable task = () -> {

			example.doSomething();
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();

	}

	private void doSomething() {

		if (lock.tryLock()) 
		{
			try {
				// critical section only one thread can exceute here
				System.out.println(Thread.currentThread().getName() + " " + "Acquired The Lock");
			} 
			finally {
				lock.unlock();// Always Release the lock in finally block
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " " + " Could Not Acquired The Lock");
		}
	}

}
