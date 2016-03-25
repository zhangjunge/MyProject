package com.dove.test;

import java.util.Scanner;

public class Jingdong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int temp = 0;
		int i = 1;
		while (true) {
			temp = sum;
			for (; i <= n; i++) {
				if (temp % n == 1) {
					temp -= (temp / n + 1);
					if (temp <= 0) {
						break;
					}
				} else 
					break;
			}
			if (i > n) {
				System.out.println(n);
				break;
			}

			++sum;
		}// while
		
	}
}
