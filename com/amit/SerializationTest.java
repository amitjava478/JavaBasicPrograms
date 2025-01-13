package com.amit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private static String name="ajay";

	private String password;

	public Student(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password +"]";
	}
	

}

public class SerializationTest {

	public static void main(String[] args) throws Exception {
	
		//performing serilization
		
		Student s1=new Student(10, "amit", "ash@34");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("baba.text"));
		
		out.writeObject(s1);
		
		System.out.println("serilization Done");
		
		//performing dserilization
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("baba.text"));
		Student student=(Student) in.readObject();
		
		System.out.println(student);
		
	System.out.println("Deserilization Done");
		
		

	}

}
