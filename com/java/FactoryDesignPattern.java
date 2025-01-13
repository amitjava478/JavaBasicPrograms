package com.java;

interface Connection {

	void connect();
}

class Oracle implements Connection {

	@Override
	public void connect() {
		System.out.println("its a Oracle Connection");
	}

}

class Mysql implements Connection {

	@Override
	public void connect() {
		System.out.println("its a Mysql Connection");
	}

}

class Hello {
	private static Connection con;

	public static Connection getInstance(int i) {

		if (i == 1) {
			con = new Oracle();
		} else {
			con = new Mysql();
		}

		return con;
	}

}

public class FactoryDesignPattern {

	public static void main(String[] args) {

		Connection con = Hello.getInstance(0);
		con.connect();

	}

}
