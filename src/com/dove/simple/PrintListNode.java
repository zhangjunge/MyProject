package com.dove.simple;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class PrintListNode {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode head) {
		ListNode p = head.next;
		Stack<ListNode> s = new Stack<ListNode>();
		while (p != null) {
			System.out.println(p.val);
			s.push(p);
			p = p.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (!s.isEmpty()) {
			ListNode n = s.pop();
			System.out.print(n.val + " ");
			list.add(n.val);
		}
		return list;
	}

	public static int minNumberInRotateArray(int[] array) {
		if (array == null)
			return 0;
		int right = array.length - 1;
		int left = 0;
		int mid = left;
		while (array[left] >= array[right]) {
			if (right - left == 1 && array[right] < array[left]) {
				mid = right;
				break;
			}
			mid = (right + left) / 2;
			if (array[mid] > array[left])
				left = mid;
			else if (array[mid] > array[left]) {
				right = mid;
			} else {
				int min = left;
				for (int i = left + 1; i <= right; i++) {
					if (array[i] < array[min])
						min = i;
				}
				return array[min];
			}
		}

		return array[mid];
	}

	public static int JumpFloorII(int n) {
		if (n <= 0)
			return 0;
		else if (n <= 2)
			return n;
		else
			return JumpFloorII(n - 1) + JumpFloorII(n - 2);

	}

	public static double Power(double base, int e) {
		if (e == 0)
			return 1;
		if (Math.abs(base - 0) == 0.0000001)
			return 0;
		double result = 1;
		boolean nagative = false;
		if (e < 0) {
			nagative = true;
			e = -e;
		}
		for (int i = 1; i <= e; i++) {
			result = result * base;
		}
		return nagative ? 1.0 / result : result;
	}

	public static ListNode FindKthToTail(ListNode head, int k) {
		 if (head == null)
				return null;
			ListNode p = head;
			ListNode q = head;
			int i = 0;
			while (q != null && i < k) {
				i++;
				q = q.next;
	            if(q==null&&i<k)return null;
			}
	        
			while (p != null && q != null) {
				p = p.next;
				q = q.next;
				
			}
			return p;

	}

	public static void main(String[] args) {
		int[] array = { 2, 2, 1, 2, 2, 2 };
		int key = minNumberInRotateArray(array);
		System.out.println(key);
		System.out.println(JumpFloorII(3));

		System.out.println(Power(0.1, -3));
		ListNode head = new ListNode(1);
		ListNode tempHead = head;
		for (int i = 2; i <= 7; i++) {
			ListNode node = new ListNode(i);
			head.next = node;
			head = node;
		}
		System.out.println(FindKthToTail(tempHead, 7).val);
	}
}