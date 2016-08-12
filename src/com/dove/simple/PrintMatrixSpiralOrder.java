package com.dove.simple;

/**
 * תȦ��ӡ����
 * 
 * @author enovo
 *
 */
public class PrintMatrixSpiralOrder {
	public static void spiralOrderPrint(int[][] matrix) {
		int tr = 0;
		int tc = 0;
		int dr = matrix.length - 1;
		int dc = matrix[0].length - 1;
		while (tr <= dr && tc <= dc) {
			printEdgeSame(matrix, tr++, tc++, dr--, dc--);
		}
	}

	/**
	 * ��ӡһȦ������
	 * 
	 * @param matrix
	 * @param tr
	 *            row ���ϽǺ�����
	 * @param tc
	 *            column ���Ͻ�������
	 * @param dr
	 *            ���½Ǻ�����
	 * @param dc
	 *            ���½�������
	 */
	
	
	public static void printEdge(int[][] matrix, int tr, int tc, int dr, int dc) {
		// ֻʣ��һ��
		if (tr == dr) {
			for (int i = tc; i <= dc; i++)
				System.out.println(matrix[tr][i] + " ");
		} else if (tc == dc) {// ֻʣ��һ��
			for (int i = tr; i <= dr; i++)
				System.out.println(matrix[i][dc] + " ");
		} else {
			int currentR = tr; // ��
			int currentC = tc; // ��
			while (currentC != dc) {
				System.out.println(matrix[tr][currentC] + " ");
				currentC++;
			}
			while (currentR != dr) {
				System.out.println(matrix[currentR][dc] + " ");
				currentR++;
			}
			while (currentC != tc) {
				System.out.println(matrix[dr][currentC] + " ");
				currentC--;
			}

			while (currentR != tr) {
				System.out.println(matrix[currentR][tc] + " ");
				currentR--;
			}
		}
	}
	
	public static void printEdgeSame(int[][] matrix, int tr, int tc, int dr, int dc) {
		// ֻʣ��һ��
		if (tr == dr) {
			for (int i = tc; i <= dc; i++)
				matrix[tr][i] = 0;
		} else if (tc == dc) {// ֻʣ��һ��
			for (int i = tr; i <= dr; i++)
				matrix[i][dc] = 0;
		}
		 else {
			int currentR = tr; // ��
			int currentC = tc; // ��
			int item = dr - tr ;
			while (currentC != dc) {
				matrix[tr][currentC] = item;
				currentC++;
			}
			while (currentR != dr) {
				matrix[currentR][dc] = item;
				currentR++;
			}
			while (currentC != tc) {
				matrix[dr][currentC] = item;
				
				currentC--;
			}

			while (currentR != tr) {
				matrix[currentR][tc] = item;
				currentR--;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		//spiralOrderPrint(matrix);
		int [][] matrix2 = new int[9][5];
		spiralOrderPrint(matrix2);
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				System.out.print(matrix2[i][j]);
			}
			System.out.println();
		}
	}

}
