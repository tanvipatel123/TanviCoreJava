package com.repeat;

class FirstThread extends Thread
{
	public void run() //running..
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My First Thread Start :"+ i);
			//Thread.sleep(1000);
		}
		System.out.println("My First THread Complated...");
	}
}


public class ThreadDemo2
{
	public static void main(String[] args) {
		FirstThread ft = new FirstThread();//newborn thread..
		ft.setName("MyFirstThread");
		ft.setPriority(Thread.NORM_PRIORITY);
		System.out.println(ft);
		ft.start();//runnable thread...
		ft.run();
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Main Thread.."+i);
			//Thread.sleep(100000);
		}
		System.out.println("my main thread is complated");
	}
}
