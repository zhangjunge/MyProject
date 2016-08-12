package com.dove.test;

public class HeapSort {
	public static void main(String[] args) {
		int a[] = new int[21];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (100 + Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i = a.length;i>0;i--){
			heapsort(a,i);
		}
	}
	public static void heapsort(int[] a, int length) {
		for(int i = length/2-1;i>=0;i--){
			int maxid = 2*i+1;
			if(2*(i+1)<length){
				if(a[2*i+1]<a[2*i+2]){
					maxid=2*i+2;
				}
			}
			if(a[i]<a[maxid]){
				int temp = a[i];
				a[i]=a[maxid];
				a[maxid]=temp;
			}
		}
		System.out.print(a[0]+" ");
		a[0]=a[length-1];
	}
}
