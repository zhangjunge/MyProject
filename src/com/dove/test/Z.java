package com.dove.test;



abstract class X{
    public String a = "x";
    public X(){
    	System.out.print(a);
        System.out.print("X");
    }
}

public class Z extends X{
   public  String a="z";
    
   
	public Z(){
        System.out.print("Z");
        System.out.print(a);
    }
    public static void main(String[] args) {
      Z z = new Z();
    }
}

//public  class Cat extends Animal{
//
//    public Cat(){
//        System.out.printf("I am a cat");
//    }
//    
//    public static void main(String[] args) {
//        System.out.println("value="+switchit(4));//3
//    }
//    
//        
//    public static int switchit(int x) {
//        int j=1;
//        switch (x) {
//        case 1:j++;
//        case 2:j++;
//        case 3:j++;
//        case 4:j++;
//        case 5:j++;
//        default:j++;
//        }
//        return j+x;
//    }
//    
	
