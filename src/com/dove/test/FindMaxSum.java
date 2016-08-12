package com.dove.test;

public class FindMaxSum {
	
	public static double maxProduct(double[] arr) {
	    if (arr == null || arr.length == 0) {
	        return 0;
	    }
	    double max = arr[0];
	    double min = arr[0];
	    double res = arr[0];
	    double maxEnd = 0;
	    double minEnd = 0;
	    for (int i = 1; i < arr.length; ++i) {
	        maxEnd = max * arr[i];
	        minEnd = min * arr[i];
	        max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
	        min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
	        res = Math.max(res, max);
	    }
	    return res;
	}
public static void main(String[] args) {
	
	double[] a = {2,3,-1,0.1,4,5,-3,0,9};
	System.out.println(maxProduct(a));
	
}
}
