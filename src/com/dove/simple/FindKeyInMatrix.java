package com.dove.simple;

public class FindKeyInMatrix {
	public static  boolean Find(int[][] array, int target) {
		if (array == null)
			return false;
		int row = array.length;
		int column = array[0].length;
		if (row != 0 || column != 0) {
			int tempRow = 0;
			column = column - 1;
			while (tempRow < row && column >= 0) {
				if (array[tempRow][column] == target) {
					return true;
				} else if (array[tempRow][column] > target) {
					column--;
				} else {
					tempRow++;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		if(Find(array,45)){
			System.out.println("i find it");
		}else{
			System.out.println("i cannot find it");
		}
	}

}
