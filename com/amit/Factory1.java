package com.amit;

interface Connection {

	void connect();

}

class Mysql implements Connection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("its a mysql connection");

	}

}

class Oracle implements Connection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("its a Oracle connection");

	}

}

public class Factory1 {

	public static Connection instance;

	public static void main(String[] args) {

		Connection con = Factory1.getInstance(1);

		con.connect();

	}

	private static Connection getInstance(int i) {

		if (i == 0) {
			instance = new Mysql();
		}

		else if (i == 1) {
			instance = new Oracle();
		}
		return instance;
	}

}
