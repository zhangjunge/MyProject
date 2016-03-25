package com.dove.simple;

/**
 * ֮�ִ�ӡ����
 * 
 * @author enovo
 *
 */
public class Problem_03_ZigZagPrintMatrix {
	public static void printMatrixZigZag(int[][] matrix) {
		int tR = 0;
		int tC = 0;
		int dR = 0;
		int dC = 0;
		int endR = matrix.length - 1;
		int endC = matrix[0].length - 1;
		boolean fromUp = false;
		while (dC <= endC) {
			printLevel(matrix, tR, tC, dR, dC, fromUp);

			//tR = tC == endC ? tR + 1 : tR;
			//tC = tC == endC ? tC : tC + 1;
			// �ȼ���
			if (tC == endC) {
				tR = tR + 1;
			} else {
				tC = tC + 1;
			}
			if (dR == endR) {
				dC = dC + 1;
			} else {
				dR = dR + 1;
			}
			//dC = dR == endR ? dC + 1 : dC;
			//dR = dR == endR ? dR : dR + 1;
			fromUp = !fromUp;
		}
		System.out.println();
	}

	public static void printLevel(int[][] m, int tR, int tC, int dR, int dC,
			boolean f) {
		if (f) {
			while (tR < dR + 1) {
				System.out.print(m[tR++][tC--] + " ");
			}
		} else {
			while (dR != tR - 1) {
				System.out.print(m[dR--][dC++] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		printMatrixZigZag(matrix);
	}
}