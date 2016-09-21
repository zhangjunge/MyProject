package com.dove.test;

import java.util.Scanner;

/**
 * 一个矩阵中，右边比左边大，下面比上面大，从中找到指定的数字a，
 * 
 * @author Dovezjg
 *
 */
public class FindNumINMatrix {

	public static boolean findNum(int[][] matrix, int key) {
		// 先找到右上角的数字，如果比key大，则不用遍历key所在的列，如果比key小，则不用遍历key所在的行
		int row = matrix.length;
		int column = matrix[0].length;
		// boolean found = false;
		if (matrix == null || row == 0 || column == 0) {
			return false;
		}

		int tempRow = 0;
		column = column - 1;
		while (tempRow < row && column >= 0) {
			if (matrix[tempRow][column] == key)
				return true;
			else if (matrix[tempRow][column] < key) {
				tempRow++;
			} else {
				column--;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		if (findNum(matrix, key)) {
			System.out.println("i find it");
		} else {
			System.out.println("i cannot find it");
		}
		sc.close();

	}

}
