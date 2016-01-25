package com.dove.simple;

public class Main {
	
	public static void main(String[] args) {
		int[] a={81715,81715,46944,81715,81715,61523,81715,81715,81715,81715,81715,81715,81715,81715,85450,81715,81715,385,81715,81715,44875,81715,36639,46789,84271,90423,6012,81715,81715,75476,46569,55883,48485,72781,81715,67802,81715,81715,22887,28504,56714,81715,29944,3238,84963,63709,47553,81715,81715,81715,54414,12131,81715,81715,81715,81715,61090,81715,57625,73388,81715,81715,10014,81715,81715,81715,10563,81715,81715,42633,82398,69691,29995,68168,92501,82005};
		System.out.println(find(a));
		
	}

	private static int find(int[] a) {
		int cur = a[0];
		int times = 0;
		for (int i = 0; i < a.length; i++) {
			if(cur==a[i]) times++;
			else times--;
			if(times==0){
				if(i+1<a.length)
				cur=a[i+1];
			}
		}
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==cur) count++;
		}
		if(count>a.length/2){
			return cur;
		}else{
			return 0;
		}
	}

}
