package com.dove.test;

public class FindNum {

	public static void find(int a[][], int tr, int tc, int dr, int dc) {
		int midr = (tr + dr) / 2;
		int midc = (dc + tc) / 2;
		//while(tr<)

	}
	
	public static void find(int a[][], int tr, int tc, int dr, int dc, int target) {
		int midr = (tr + dr) / 2;
		int midc = (dc + tc) / 2;
		
		if (midr == tr || midr == dr) {
			
		} else {
			
			
		}
		
		if (a[midr][midc] == target) {
			System.out.println("终于找到你了：a[" + midr + "][" + midc + "]=" + target);
			return ;
		} else if (a[midr][midc] < target) {
			find(a, midr, midc, dr, dc, target);
		} else {
			find(a, tr, tc, midr, midc, target);
		}
		//while(tr<)
		System.out.println("没找到");

	}

	public static void makeMatrix(int[][] a) {
		int row = a.length - 1;
		int column = a[0].length - 1;
		a[row][0] = 1;
		for (int i = 1; i <= column; i++) {
			a[row][i] = findMaxInMatrix(a)+1;
		}
		for (int i = row - 1; i >= 0; i--) {
			a[i][0] = findMaxInMatrix(a)+1;
		}
		for (int x = row - 1; x >= 0; x--) {
			for (int y = 1; y <= column; y++) {
				a[x][y] = findMaxInMatrix(a)+1;
			}
		}
	}

	public static int findMaxInMatrix(int a[][]) {
		int row = a.length - 1;
		int column = a[0].length - 1;
		int max = 0;

		for (int x = 0; x <= row; x++) {
			for (int y = 0; y <= column; y++) {
				if (a[x][y] > max) {
					max = a[x][y];
				}
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[][] a = new int[7][7];
		makeMatrix(a);
		int row = a.length - 1;
		int column = a[0].length - 1;

		for (int x = 0; x <= row; x++) {
			for (int y = 0; y <= column; y++) {
				System.out.print(a[x][y] + " ");
			}
			System.out.println();
		}
		
		find(a, 0, 0, 6, 6, 46);

	}
	
//	13 44 45 46 47 48 49 
//	12 38 39 40 41 42 43 
//	11 32 33 34 35 36 37 
//	10 26 27 28 29 30 31 
//	9  20 21 22 23 24 25 
//	8  14 15 16 17 18 19 
//	1  2   3  4  5  6  7 

}
