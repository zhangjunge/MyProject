package com.dove.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyThread extends Thread {

	public static int[] money = new int[20];
	public static int sum = 2000;
  public static final int count = 100;
	public int oneMoney;

	public String customer;

	public MyThread(String customer, int oneMoney) {
		this.oneMoney = oneMoney;
		this.customer = customer;
	}

	public static synchronized int deduct(int money) {
		if (sum >=1000 && sum > money) {
			sum = sum - money;
			return 1; //分配成功
		}
		return 0; //分配失败
	}

	public void run() {

		if (deduct(this.oneMoney) == 1) {
			System.out.println(this.customer + ":" + this.oneMoney);
		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < money.length; i++) {
			money[i] = (i + 1) * 1000;
		}
		MyThread[] threads = new MyThread[count];

		for (int i = 0; i < threads.length; i++) {
			int x =0;//随机下标
			if(sum<20000){
				x = (int) (Math.random() * (sum/1000));
			}else{
				x = (int) (Math.random() * 19);
			}
			
			MyThread t1 = new MyThread("客户" + i, money[x]);
			t1.start();
		}

	}

}
