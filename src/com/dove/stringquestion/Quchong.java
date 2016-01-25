package com.dove.stringquestion;

import java.util.LinkedList;

public class Quchong {

	public static LinkedList<Character> removeRepeat(LinkedList<Character> s) {
		int size = s.size();
		int[] map = new int[size];
		for (int i = 0; i < map.length; i++) {
			map[i] = 0;
		}
		for (int i = 0; i < s.size(); i++) {
			if (map[s.get(i) % size] == 1) {
				s.remove(i);
			} else {
				map[s.get(i) % size] = 1;
			}
		}
		return s;

	}

	 static void insertion_sort(int[] unsorted)
     {
		 int count = 0;
         for (int i = 1; i < unsorted.length; i++)
         {
             if (unsorted[i - 1] > unsorted[i])
             {
                 int temp = unsorted[i];
                 int j = i;
                 while (j > 0 && unsorted[j - 1] > temp)
                 {
                     unsorted[j] = unsorted[j - 1];
                     j--;
                     count++;
                 }
                 unsorted[j] = temp;
             }
         }
         System.out.println(count);
     }
	
	public static void nixushu(int[] a) {

		int count = 0;
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0) {

				if (a[i] < a[j]) {
					a[j + 1] = a[j];
					count++;
				} else {
					a[j+1] = key;
					break;
				}
				j--;
			}

		}
		System.out.println(count);
	}

	public static LinkedList<Character> remove(LinkedList<Character> s) {
		int size = s.size();
		int[] map = new int[size];
		for (int i = 0; i < map.length; i++) {
			map[i] = 0;
		}
		for (int i = 0; i < s.size(); i++) {
			if (map[s.get(i) % size] == 1) {
				s.remove(i);
			} else {
				map[s.get(i) % size] = 1;
			}
		}
		return s;

	}

	public static void main(String[] args) {

		LinkedList<Character> list = new LinkedList();
		list.add('g');
		list.add('o');
		list.add('o');
		list.add('g');
		list.add('l');
		list.add('e');
		list.add('s');
		list.add('g');
		LinkedList<Character> result = removeRepeat(list);
		for (Character character : result) {
			System.out.println(character);
		}
		int[] a = { 7, 5, 6, 4 };
		insertion_sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
