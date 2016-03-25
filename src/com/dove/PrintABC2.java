package com.dove;
import java.util.ArrayList;
import java.util.HashMap;


public class PrintABC2 implements Runnable{

	public static Boolean isThreadA = true;
	public static Boolean isThreadB = false;
	public static Boolean isThreadC = false;
	public static int num = 3;
	
	//public String name;
	@Override
	public   void run() {
		synchronized(this) {
		  System.out.println(Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
	    final   Runnable runnable = new PrintABC2();
		Thread t1 = new Thread(runnable,"A");
		Thread t2 = new Thread(runnable,"B");
		Thread t3 = new Thread(runnable,"C");
		for(int i= 0;i<3;i++){
			t1.start();
			t2.start();
			t3.start();
		}
		
	}



	
}