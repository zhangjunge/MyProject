package com.dove.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MethodTest {

	public MethodTest() {
		// TODO Auto-generated constructor stub
	}
	
	public server(){
		
	}
	public static void main(String[] args) {
		
		String currentShouldRepayTotalStr = "110.0952";
		BigDecimal currentShouldRepayTotal = BigDecimal.ZERO;
		 currentShouldRepayTotal = new BigDecimal(currentShouldRepayTotalStr).multiply(new BigDecimal("100"))
                 .setScale(0, RoundingMode.HALF_EVEN);//四舍五入
		 System.out.println(currentShouldRepayTotal);
		 BigDecimal bd = new BigDecimal(1.0);
		 BigDecimal sum  = currentShouldRepayTotal.add(bd);
		 System.out.println(sum);
		if( bd.compareTo(sum)<0){
			System.out.println("bd<sum");
		}
		 
		 
	}

}
