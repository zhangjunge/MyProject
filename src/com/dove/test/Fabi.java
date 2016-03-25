package com.dove.test;

import java.util.Scanner;


public class Fabi {
	 public static int Fibonacci(int n) {
		 if(n<=1)
	            return n;
	        int f1=0,f2=1,f3=0;
	        for(int i=2;i<=n;i++){
	            f3=f1+f2;
	            f1=f2;
	            f2=f3;
	        }
	        return f3;

	    }
	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();		
		System.out.println(Fibonacci(n) );
	}

}
