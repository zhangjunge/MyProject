package com.dove.test;

public class MaxMin {
	static int[] a = {-9,2,3,4,55,6,4};

	public static IntPair getMaxMin(int[] a, int low, int high) {
		IntPair pair = new IntPair();
		if (low > high - 2) {
			if (a[low] > a[high]) {
				pair.max = a[low];pair.min=a[high];
			} else {
				pair.max= a[high];pair.min=a[low];
			}
		}else{
			int mid=(low+high)/2;
			IntPair p1 = getMaxMin(a,low,mid);
			IntPair p2 = getMaxMin(a,mid,high);
			pair.max = p1.max>p2.max?p1.max:p2.max;
			pair.min = p1.min<p2.min?p1.min:p2.min;					
		}
		return pair;
	}
	public static void main(String[] args) {
	    IntPair result = getMaxMin( a, 0, a.length-1) ;
	    System.out.println(result.max+" "+result.min);
		
		
	}
	
	

}

class IntPair{
	int min;
	int max;
}
