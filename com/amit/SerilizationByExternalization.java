package com.amit;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee1 implements Externalizable {

	private int id;

	private String name;

	private String password;

	public Employee1() {

	}

	public Employee1(int id, String name, String password) {
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
		return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		id = in.readInt();

	}

}

public class SerilizationByExternalization {

	public static void main(String[] args) {

		Employee1 e = new Employee1(1, "amit", "ashayadav@123");

		// Serilization of Employee Object

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc.text"))) {

			out.writeObject(e);
			System.out.println("Serilization is done..");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// performing Desrilization Of Employee

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.text"))) {
			Employee1 emp = (Employee1) in.readObject();
			System.out.println(emp);

			System.out.println("DeSerilization is done..");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
