package com.amit;

import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLockExample3
{

	ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {

		ReenTrantLockExample3 exampel = new ReenTrantLockExample3();

		Thread t1 = new Thread(() -> {

			try {
				exampel.doSomething();
			} catch (InterruptedException e) {

				System.out.println(Thread.currentThread().getName() + " " + "was Interuppted");
			}

		}, "Thread-1");

		Thread t2 = new Thread(() -> {
			t1.interrupt();// interrupt t1 while its waiting for the lock
			System.out.println("Thread2 interuppted Thread 1");

		}, "Thread-2");

		t1.start();
		t2.start();

	}

	private void doSomething() throws InterruptedException {

		lock.lockInterruptibly();

		try {
			// critical section

			System.out.println(Thread.currentThread().getName() + "is executing");
		} finally {
			lock.unlock();// release the lock
		}
	}

}
