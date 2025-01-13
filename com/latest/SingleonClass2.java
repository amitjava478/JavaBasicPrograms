package com.latest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

class SingeletonAmit implements Cloneable,Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile SingeletonAmit instance;
	
	private SingeletonAmit() {
		
		if(instance!=null)
		{
			throw new IllegalStateException("Instance Already Created");
		}
		
	}
	
	
	public static SingeletonAmit getInstance()
	{
		if(instance==null)
		{
			synchronized (SingeletonAmit.class) {
				
				if(instance==null)
				{
					instance=new SingeletonAmit();
				}
			}
		}
		return instance;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException("Cloning is not Supported");
	}
	
	public Object readResolve() {
		
		return getInstance();
	}
}

public class SingleonClass2 {

	public static void main(String[] args) throws Exception {

		SingeletonAmit instance1=SingeletonAmit.getInstance();
		SingeletonAmit instance2=SingeletonAmit.getInstance();
		
		//SingeletonAmit instance3=(SingeletonAmit) instance1.clone();
		//System.out.println(instance3);
		
		//Constructor<SingeletonAmit> constructor=SingeletonAmit.class.getDeclaredConstructor();
		//constructor.setAccessible(true);
		//SingeletonAmit insatnce3=constructor.newInstance();
		//System.out.println(insatnce3);
		
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("amit2.text"));
		out.writeObject(instance1);
		
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("amit2.text"));
				
		SingeletonAmit instance3=(SingeletonAmit) in.readObject();
		System.out.println(instance3);
		
		
		
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		System.out.println(instance1==instance2);
		
		
	}

}
