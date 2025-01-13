package com.latest;


class Test233
{	
	protected void methodA()
	{
		System.out.println("Super Method A");
	}
	
}

public class Test56 extends Test233
{
	
	protected void methodA()
	{
		System.out.println("child Method A");
	}

	public static void main(String[] args) {
		
		
		Test233 t=new Test56();
		
		t.methodA();

	}
	
	

}
