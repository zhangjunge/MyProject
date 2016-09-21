package com.dove.test;

public class Acm {

	public static String replaceSpace(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (temp == 32) {
				sb.append("%20");
			} else {
				sb.append(temp);
			}
		}
		return sb.toString();
	}

	public static int NumberOf1(int n) {
        int num = 0;
       
        int j = 0;
        while(n!=0){
        	j = n%2;
            n = n/2;
            if(j==1){
                num++;
             }
                
        }
        return num;

    }

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("hello world");
		System.out.println(replaceSpace(str));
		int a[] = {2,4,6,1,3,5,7};
		System.out.println(NumberOf1(7));
	}
}
