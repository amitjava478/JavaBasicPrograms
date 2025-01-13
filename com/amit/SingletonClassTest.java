package com.amit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;


final class Singleton4 implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile Singleton4 instance;

	// Prevention of instance creation from reflection
	private Singleton4() {
		if (instance != null) {
			throw new IllegalStateException("Singleton Instance Already Created..");
		}
	}

	public static Singleton4 getInstance() {

		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

	// Prevent instance Creation from cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("Cloning Of this singleton is not allowed..");
	}

	// prevent From Desialization instacnce Creation
	protected Object readResolve() {

		return getInstance();
	}
}

public class SingletonClassTest {

	public static void main(String[] args) throws Exception {

		Singleton4 instance1 = Singleton4.getInstance();

		Singleton4 instance2 = Singleton4.getInstance();

		/*
		 * // serialize the instance
		 * 
		 * ObjectOutputStream out = new ObjectOutputStream(new
		 * FileOutputStream("amit.text"));
		 * 
		 * out.writeObject(instance1);
		 * 
		 * 
		 * // deseirlize the isntance
		 * 
		 * ObjectInputStream in = new ObjectInputStream(new
		 * FileInputStream("amit.text"));
		 * 
		 * 
		 * Singleton4 instance3 = (Singleton4) in.readObject();
		 * 
		 * 
		 * //instance from reflection
		 * 
		 * Constructor<Singleton4>
		 * constructor=Singleton4.class.getDeclaredConstructor();
		 * constructor.setAccessible(true);
		 * 
		 * Singleton4 instance4=constructor.newInstance();
		 * 
		 */

		System.out.println(instance1);
		System.out.println(instance2);

		System.out.println(instance1 == instance2);

	}

}
