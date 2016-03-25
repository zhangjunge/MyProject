package com.dove.simple;

/**
 * ��СӲ������
 * 
 * @author enovo
 *
 */
public class MinConis {
	/**
	 * Ӳ�����㣺��̬�滮�㷨
	 * 
	 * @param values
	 *            :����ÿһ��Ӳ�ҵı�ֵ������
	 * @param valueKinds
	 *            :��ֵ��ͬ��Ӳ��������������coinValue[]����Ĵ�С
	 * @param money
	 *            :��Ҫ�������ֵ
	 * @param coinsUsed
	 *            :������ֵΪi��ֽ�������������СӲ����
	 */
	public static void makeChange(int[] values, int valueKinds, int money,
			int[] coinsUsed) {

		coinsUsed[0] = 0;
		// ��ÿһ��Ǯ�����㣬������������Ľ��Ա��ã������
		for (int cents = 1; cents <= money; cents++) {

			// ������С��ֵ��Ӳ������ʱ������Ӳ���������
			int minCoins = cents;

			// ����ÿһ����ֵ��Ӳ�ң����Ƿ����Ϊ���������֮һ
			for (int kind = 0; kind < valueKinds; kind++) {
				// ����ǰ��ֵ��Ӳ��С�ڵ�ǰ��cents��ֽ����Ⲣ���
				if (values[kind] <= cents) {
					int temp = coinsUsed[cents - values[kind]] + 1;
					if (temp < minCoins) {
						minCoins = temp;
					}
				}
			}
			// ������СӲ����
			coinsUsed[cents] = minCoins;

			System.out.println("��ֵΪ " + (cents) + " ����СӲ���� : "
					+ coinsUsed[cents]);
		}
	}

	public static void makeChange2(int[] values, int valueKinds, int money,
			int[] coinsUsed) {

		int max = Integer.MAX_VALUE;
		int cents =1;
		// ��ÿһ��Ǯ�����㣬������������Ľ��Ա��ã������
		for ( cents = 1; cents <= money; cents++) {
			// ����ÿһ����ֵ��Ӳ�ң����Ƿ����Ϊ���������֮һ
			int temp = max;
			int minCoins = max;
			for (int kind = 0; kind < valueKinds; kind++) {
				// ����ǰ��ֵ��Ӳ��С�ڵ�ǰ��cents��ֽ����Ⲣ���
				if (values[kind] < cents) {
					if (coinsUsed[cents - values[kind]] != max) {
						temp = coinsUsed[cents - values[kind]] + 1;
					}
				} else if (cents == values[kind]) {
					temp = 1; minCoins  = 1;break;
				}

				minCoins = Math.min(minCoins, temp);

			}
			// ������СӲ����
			coinsUsed[cents] = minCoins;		
		}
		if (coinsUsed[money] == max) {
			System.out.println("��ֵΪ " + (money) + " ����СӲ���� : " + 0);
		} else {
			System.out.println("��ֵΪ " + (money) + " ����СӲ���� : "
					+ coinsUsed[money]);
		}
	}

	public static void main(String[] args) {

		// Ӳ����ֵԤ���Ѿ�����������
		int[] coinValue = new int[] { 1,3,5,11,20};
		// ��Ҫ�������ֵ
		int money = 99;
		// ����ÿһ����ֵ�����������СӲ������0�ŵ�Ԫ�������ã�����Ҫ���1
		int[] coinsUsed = new int[money + 1];

		// makeChange2(coinValue, coinValue.length, money, coinsUsed);
		makeChange2(coinValue, coinValue.length, money, coinsUsed);
	}

}
