package com.repeat;



class MyThread extends Thread
{
	public MyThread()
	{
		super("child Thread");
		start();
	}
	public void run()
	{
		try {
			for(int i=0;i<5;i++)
			{
			
			Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadDEmo3 {
	public static void main(String[] args) {
		
	}
}
