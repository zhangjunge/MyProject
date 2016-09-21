package com.dove.sort;

import java.util.Arrays;

public class mergingSort {

	public static void main(String[] args) {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		sort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	
	public static void sort(int[] data, int left, int right) {// left=0 right = length-1
		if (left < right) {
			int center = (left + right) / 2;  // 找出中间索引
			sort(data, left, center);// 对左边数组进行递归
			sort(data, center + 1, right);// 对右边数组进行递归
			merge(data, left, center, right);// 合并
		}}
	public static void merge(int[] data, int left, int center, int right) {
		int[] tmpArr = new int[data.length];
		int mid = center + 1;
		int third = left;// third记录中间数组的索引
		int tmp = left;
		while (left <= center && mid <= right) {
			// 从两个数组中取出最小的放入中间数组
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}
		// 剩余部分依次放入中间数组
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		// 将中间数组中的内容复制回原数组
		while (tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
		System.out.println(Arrays.toString(data));
	}

}
