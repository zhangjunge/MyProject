package com.dove.test;

public class MergeTest {

	public static void main(String[] args) {
		System.out.println("i edit it on local!");
		System.out.print("i add something which conflict to github ");
		System.out.println("i edit it on github");
		githubmethod();
	}
	
	static private int githubmethod(){
    	System.out.println("github增加方法");
    	return 1;
    }

}
