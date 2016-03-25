package com.dove.simple;

/**
 * �������� ��һ��n*m�ľ�����ӣ�0��0�� ����n.m�������·���� �������Ͻǵ����½Ǿ���������λ�õĺ���С
 *  1 3 5 9 
 *  8 1 3 4 
 *  5 0 6 1 
 *  8 8 4 0 
 *  
 *  1 3 1 0 6 1 �����·����
 * 
 * 
 * 
 * 
 * @author enovo
 *
 */
public class MinRoadMatrix {
	public static int[][] min(int[][] a, int[][] b) {
		b[0][0] = a[0][0];
		for (int i = 1; i < a.length; i++) {
			b[i][0] = b[i - 1][0] + a[i][0];
		}
		for (int j = 1; j < a[0].length; j++) {
			b[0][j] = b[0][j - 1] + a[0][j];
		}

		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				b[i][j] = Math
						.min(b[i - 1][j] + a[i][j], b[i][j - 1] + a[i][j]);
			}
		}
		return b;
	}

	public static void main(String[] args) {
		
		int a[][] = {{1, 3, 5, 9 },{8, 1, 3, 4},{5, 0, 6, 1 },{8, 8 ,4 ,0 }};
		int b[][] = new int[4][4];
		min(a,b);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}
}
