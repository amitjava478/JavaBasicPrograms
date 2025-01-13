package com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class SingeltonClass implements Cloneable,Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingeltonClass instance; 
	
	
	private SingeltonClass()
	{
		if(instance!=null)
		{
			throw new IllegalStateException("Instance Already Created");
		}
	}
	
	
	public static SingeltonClass getInstance()
	{
		
		if(instance==null)
		{
			synchronized (SingeltonClass.class) {
				
				if(instance==null)
				{
					instance=new SingeltonClass();
				}
				
			}
			
		}
		return instance;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException("Cloning is Not Supportted");
	}
	
	
	public Object readResolve()
	{
		return getInstance();
		
	}
}

public class SingeltonClass1 {

	public static void main(String[] args) throws Exception {
		
		
		SingeltonClass intance1=SingeltonClass.getInstance();
		SingeltonClass intance2=SingeltonClass.getInstance();
		
		//SingeltonClass instance3=(SingeltonClass) intance1.clone();
		//System.out.println(instance3);
		
		System.out.println(intance1);
		System.out.println(intance2);
		
		
		/*
		 * Constructor<SingeltonClass>
		 * constructor=SingeltonClass.class.getDeclaredConstructor();
		 * constructor.setAccessible(true); SingeltonClass
		 * instance4=constructor.newInstance();
		 * 
		 * System.out.println(instance4);
		 */
		
		
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("abc.text"));
		
		out.writeObject(intance1);
			
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("abc.text"));
		
		SingeltonClass instance3=(SingeltonClass) in.readObject();
		
		System.out.println(instance3);
			

	}

}
