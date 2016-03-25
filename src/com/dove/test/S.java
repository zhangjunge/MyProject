package com.dove.test;

public class S {
	
	public static int hehe(String a ,String b){
		 int la=a.length();
			int lb = b.length();
			if(la<lb) return 0;
			 int flag = 0;
			 int i = 0;int j = 0;
			while(i<la&&j<lb){
			  if(a.charAt(i)==b.charAt(j)){
			    flag = 1;
			     i++;j++;
			  }else {
			     flag = 0;
			     i++;
			  }
			 
			}
			return flag;
	}
	

	public static void stoint(String s){
		int num = 0;
		int i = 0;
		while(i<s.length()){
			num = num*10+ s.charAt(i)-'0';
			i++;
			
		}
		System.out.println(num);
		
		
		
	}
	
	public static void main(String[] args) {
		String a = "abdfdfee";
		String b = "dfdf";
		System.out.println(hehe(a,b));
		stoint("2345");
		
	}
}