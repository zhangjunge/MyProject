package com.dove.test;

public class OodFront {

	public int NumberOf1(int n) {
		int num = 0;
		int j = 0;
		while (n != 0) {
			j = n % 2;// n&1
			n = n / 2;
			if (j == 1) {
				num++;
			}
		}
		return num;
	}

	public void reOrderArray(int[] a) {
		int first1 = -1;
		int first2 = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				first2 = i;
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				first1 = i;
				break;
			}
		}
		if (first1 == -1 || first2 == -1) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			return;
		}
		if (first1 > first2) {
			int temp = a[first1];
			for (int i = first1; i > first2; i--) {
				a[i] = a[i - 1];
			}
			a[first2] = temp;
			first1 = first2;
			first2 = first1 + 1;
		}
		int cur2 = first2;
		for (int i = first2 + 1; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				int temp = a[i];
				for (int j = i - 1; j >= cur2; j--) {
					a[j + 1] = a[j];
				}
				a[cur2] = temp;
				cur2++;
			}
		}
	}
}