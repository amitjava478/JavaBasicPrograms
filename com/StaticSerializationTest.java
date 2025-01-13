package com;

import java.io.*;

class TestSerialization implements Serializable {
	private static final long serialVersionUID = 1L;

	// Static field
	static String staticField = "Initial Static Value";

	// Non-static field
	private String nonStaticField;

	// Constructor
	public TestSerialization(String nonStaticField) {
		this.nonStaticField = nonStaticField;
	}

	// Getters
	public String getNonStaticField() {
		return nonStaticField;
	}

	public static String getStaticField() {
		return staticField;
	}
}

public class StaticSerializationTest {
	public static void main(String[] args) {
		try {
			// Step 1: Create an object
			TestSerialization obj = new TestSerialization("Non-static Value");

			// Step 2: Serialize the object
			FileOutputStream fileOut = new FileOutputStream("test.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
			fileOut.close();
			System.out.println("Object serialized.");

			// Step 3: Modify the static field
			TestSerialization.staticField = "Modified Static Value";

			// Step 4: Deserialize the object
			FileInputStream fileIn = new FileInputStream("test.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			TestSerialization deserializedObj = (TestSerialization) in.readObject();
			in.close();
			fileIn.close();

			// Step 5: Print the fields
			System.out.println("After Deserialization:");
			System.out.println("Static Field: " + TestSerialization.getStaticField());
			System.out.println("Non-static Field: " + deserializedObj.getNonStaticField());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
