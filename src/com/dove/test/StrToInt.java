package com.dove.test;

import java.util.Scanner;

public class StrToInt {
	public static int strToint(String s) {
		long num = 0;
		if (s == null || s.length() == 0)
			return 0;
		boolean minus = false;
		if (s.charAt(0) == '-') {
			minus = true;
			
		} else if (s.charAt(0) == '+') {
			minus = false;
		} else if (s.charAt(0) < '0' || s.charAt(0) > '9') {
			return 0;
		} else {
			minus = false;
			num = s.charAt(0) - '0';
		}
		int i = 1;
		while (i < s.length()) {
			if (s.charAt(i) >='0' && s.charAt(i) <= '9') {
				int flag = minus ? -1 : 1;
				num = num * 10 + (s.charAt(i) - '0')*flag;
				if((!minus&&num>Integer.MAX_VALUE)||(minus&&num<Integer.MIN_VALUE)){
					return 0;
				}
			} else {
				return 0;
			}
			i++;
		}
		return (int)num ;
	}

	public static void main(String[] args) {
		String s = "54949878";
		System.out.println(strToint(s));
		//System.out.println(Integer.parseInt(s));
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		

	}
}
