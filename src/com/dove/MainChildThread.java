package com.dove;
public class MainChildThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stubh
		for (int i = 0; i < 100000000; i++) {
			System.out.println("--------------------------------------------------"+i);
		}
		System.out.println("子线程结束");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new MainChildThread());
		t.start();
		System.out.println("主线程结束");
	}
	
	

}
