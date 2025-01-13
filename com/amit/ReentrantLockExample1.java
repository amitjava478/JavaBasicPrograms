package com.amit;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample1 {

	private final ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {

		ReentrantLockExample1 example = new ReentrantLockExample1();

		Runnable task = () -> {

			example.doSomething();
		};

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();

	}

	private void doSomething() {

		lock.lock();//Acquire The Lock
		try 
		{//critical section only one thread can exceute here
         System.out.println(Thread.currentThread().getName()+" "+"is ececuting");
		} 
		finally 
		{
        lock.unlock();//Always Release the lock in finally block
		}

	}

}
