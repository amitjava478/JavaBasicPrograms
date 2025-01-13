package com.amit;
 
class Singleton
{
	
	private static volatile Singleton instance;
	
	private Singleton()
	{
		if(instance!=null)
		{
		 throw new IllegalStateException("instance Already Cteated");	
		}
	}
	
	
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			synchronized (Singleton.class) {
				
				if(instance==null)
				{
					instance=new Singleton();
				}
				
			}
		}
		
		return instance;
		
	}
}


public class Singeton3455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance1==instance2);

		
		
		
	}

}
