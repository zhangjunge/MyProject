package com.dove.test;

import java.util.Scanner;

public class Baidu {

	public static int is_include(String a, String b) {
		// a.contains("s");
		int countb[] = new int[26];
		int counta[] = new int[26];
		boolean flag = true;
		for (int j = 0; j < b.length(); j++) {
			if (b.charAt(j) < 96)
				countb[(b.charAt(j) + 32) % 97]++;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < 96)
				counta[(b.charAt(i) + 32) % 97]++;
		}
		for (int i = 0; i < countb.length; i++) {
			if (countb[i] != 0) {
				if (counta[i] < countb[i]) {
					flag = false;
				}

			}
		}
		if (flag)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	String a = sc.nextLine();
	//	String b = sc.nextLine();
	//	System.out.println(is_include(a, b));
		sc.close();
		
		String s ="午觉";
		int value = s.charAt(0);
		System.out.println(s.charAt(1)+""+value);
	}

}
