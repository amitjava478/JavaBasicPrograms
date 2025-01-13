package com.amit;

import java.util.concurrent.*;

public class CallableTest implements Callable<String> {

	@Override
	public String call() throws Exception {

		return "Callable Result";
	}

	public static void main(String[] args) throws Exception {

		ExecutorService executer = Executors.newSingleThreadExecutor();

		Future<String> future = executer.submit(new CallableTest());

		String result = future.get();// Blocks untill get the results

		System.out.println(result);

		executer.shutdown();

	}

}
