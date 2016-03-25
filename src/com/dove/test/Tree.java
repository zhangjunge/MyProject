package com.dove.test;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int value;

	public Node(int value) {
		this.value = value;
	}
}

public class Tree {
	public static void init(int[] a, LinkedList<Node> list) {
		for (int i = 0; i < a.length; i++) {
			list.add(new Node(a[i]));
		}
		for (int i = 0; i <=a.length / 2 - 1; i++) {

			list.get(i).left = list.get(2 * i + 1);
			if (2 * i + 1 != a.length - 1) {
				list.get(i).right = list.get(2 * i + 2);
			}
		}
	}

	public static void levelOrder(LinkedList<Node> list) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(list.get(0));
		while (!q.isEmpty()) {
			Node head = q.element();
			System.out.print(head.value+" ");
			q.remove(head);
			if (head.left != null) {
				q.add(head.left);
			}
			if (head.right != null) {
				q.add(head.right);
			}
		}

	}

	public static void main(String[] args) {
		int a[] = new int[10];
		LinkedList<Node> list = new LinkedList<Node>();
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		init(a,list);
		levelOrder(list);
	}

}
