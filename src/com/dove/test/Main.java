package com.dove.test;
import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            long all = 0;
            long left = 0;
            int n = sc.nextInt();
            if (n == 0) {
                sc.close();
                break;
            }
            if (n == 1) {
                System.out.println(1 + " " + 1);
            } else {
                calculate(n,all,left);
            }
        }
    }
 
    public static void calculate(int n,long all,long left) {       
        long lastPerHeap  =( 1L<<(2*(n-1)))-1;;// 最后一只猴子分了多少个
        while (true) {
            boolean flag = true;
            long perHeap = lastPerHeap;
            int index = n;
            while (index > 1) {
                perHeap = (5 * perHeap + 1);
                perHeap = perHeap / 4;
                index--;
            }
            if (flag) {
                all = 5 * perHeap + 1;
                left = n + 4 * lastPerHeap;
                System.out.println(all +" " + left);
                break;
            }
            lastPerHeap = 2<<(2*(index-1))-1;
        }
     
    }
}