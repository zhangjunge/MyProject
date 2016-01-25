package com.dove.test;

import java.util.Arrays;

/**
 * 空格全部替换为%20 不开辟额外空间，在原来的字符串数组上面操作， 先计算出总的空格数，进而计算替换后的数组长度，然后从后往前遍历替换
 * 
 * @author Dovezjg
 *
 */
public class ReplaceBlank {
	public static void replaceBlank(String s) {
		char[] items = s.toCharArray();

		int blankCount = 0;
		int length = items.length;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == 32)
				blankCount++;
		}
		int newLength = length + 2 * blankCount;
		char[] newItem = Arrays.copyOf(items, newLength);

		length = length - 1;
		while (length >= 0) {
			if (items[length] == 32) {
			//	newItem[length + 2 * blankCount] = items[length];
				newItem[length + 2 * blankCount-1] = '0';
				newItem[length + 2 * blankCount-2] = '2';
				newItem[length + 2 * blankCount-3] = '%';
				blankCount--;
			}else{
				newItem[length + 2 * blankCount] = items[length]; 
			}
			length--;
		}
		
		System.out.println(Arrays.toString(newItem));

	}
	public static void main(String[] args) {
		replaceBlank("i love shanghai ");
	}

}
