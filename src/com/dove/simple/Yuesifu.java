package com.dove.simple;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
  
public class Yuesifu {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("��������������");  
        int totalNum = scanner.nextInt();  
        System.out.print("�����뱨���Ĵ�С��");  
        int cycleNum = scanner.nextInt();  
        yuesefu(totalNum, cycleNum);  
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("dfdfdsf");
    }  
  
   public static void yuesefu(int totalNum, int countNum) {  
	   
        // ��ʼ������  
        List<Integer> start = new ArrayList<Integer>();  
        for (int i = 1; i <= totalNum; i++) {  
            start.add(i);  
        }  
        //�ӵ�K����ʼ����  
        int k = 0;  
        while (start.size() >0) {  
            k = k + countNum;  
            //��m�˵�����λ��  
            k = k % (start.size()) - 1;  
           // �ж��Ƿ񵽶�β  
            if (k < 0) {  
                System.out.println(start.get(start.size()-1));  
                start.remove(start.size() - 1);  
                k = 0;  
            } else {  
                System.out.println(start.get(k));  
                start.remove(k);  
            }  
        }  
        
    }  
}