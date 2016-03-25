package com.dove.simple;
/**
 * z�ҳ�һ������������������������ֵ����ֵ
 * eg arr = [1,3,9,10] 3,9��ֵ��󣬷���6
 * @author enovo
 *
 */
public class FindSubMax {

	public static int find(int[] a){
		int max = 0;
		for (int i = 1; i < a.length; i++) {
			max = Math.max(Math.abs(a[i]-a[i-1]), max);
		}
		return max;
	}
	public static void main(String[] args) {
		int a[] = {1,3,9,10,20,25,90};
		System.out.println(find(a));
	}
}
