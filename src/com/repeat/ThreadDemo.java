package com.repeat;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println("\nStaring Static Thread\n");
		System.out.println(t);
		//t.setName("StaticThread");
		System.out.println("After name changing thred :"+t);
		t.setPriority(Thread.MAX_PRIORITY);
		//System.out.println("After priority change :"+t);
		//System.out.println("thread is alive or not..."+t.isAlive());
		try {
		for (int i=0;i<5;i++)
		{
			System.out.println(t +": "+i);
			
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
