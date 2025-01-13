package com.latest;

import java.io.Serializable;

class Singelton implements Cloneable,Serializable
{
	private static Singelton instance;
	
	private Singelton()
	{
		
	 if(instance!=null)
	 {
		 throw new IllegalStateException("Instance Of This class Already Ctreeated");
	 }
	 
	}
	
	public static Singelton getInstance()
	{
		if(instance==null)
		{
			synchronized (Singelton.class) {
				if(instance==null)
				{
					instance=new Singelton();
				}
			}
		}
		return instance;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException("Clone Not Supported");
	}
	
	private Object readResolve() {
		
		return getInstance();
		
		
	}
}
	
public class Singleton1 {

	public static void main(String[] args) {
		
		Singelton instance1=Singelton.getInstance();
		Singelton instance2=Singelton.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance1==instance2);

	}

}
