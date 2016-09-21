package com.dove.stringquestion;

import java.util.Scanner;

public class Main {
	public static boolean isInt(char start) {
		if (start >= '0' && start <= '9') {
			return true;
		} else {
			return false;
		}
	}

	public static void findMax(String s) {
		if (s == null || s.length() == 0)
			return;
		int maxend = 0;
		int end = 0;
		int maxsize = 0;
		int size = 0;
		int sum = 0;
		int max = 0;

		char start = s.charAt(0);
		if (start >= '0' && start <= '9') {
			maxend = end = 0;
			size = maxsize = 1;
			max = sum = start - '0';
		}
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isInt(c)) {
				if (isInt(s.charAt(i-1))) {
					if (c == (s.charAt(i - 1) + 1)) {
						size++;	
						sum += c - '0';
						end = i;
					}
				}
				
			}
			if (   (c - s.charAt(i - 1)) != 1 || (end == (s.length() - 1))) {
//				if (c != (s.charAt(i - 1) + 1)) {
//					end = (i - 1 == -1) ? 0 : i - 1;
//				}
				if (size > maxsize) {
					maxsize = size;
					maxend = end;
				} else if (size == maxsize) {
					if (sum > max) {
						maxend = end;
						maxsize = size;
					}
				}			
				
				
				sum = 0;
				size = 0;
			}
		}
		System.out.println(maxsize + " " + maxend);
		System.out.println(s.substring(maxend - maxsize + 1, maxend + 1));
	}

	public static void main(String[] args) {
		if('a'!=65) System.out.println("false");
		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			String str = s.nextLine();
			findMax(str);
		}
		
		s.close();

	}
}
