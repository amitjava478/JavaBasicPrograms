package com.latest;

interface Connection {

	void connection();
}

class Mysql implements Connection {

	@Override
	public void connection() {

		System.out.println("its a mysql connection");
	}

}

class Oracle implements Connection {

	@Override
	public void connection() {
		System.out.println("its a oracle connection");
	}

}

class Hello {
	private static Connection con;

	public static Connection getConnection(int n) {
		if (n == 0) {
			con = new Mysql();
		} else if (n == 1) {
			con = new Oracle();
		}
		return con;

	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {

		Connection con = Hello.getConnection(1);
		con.connection();

	}

}
