
package com.dove.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;

public class MethodTest {

	public MethodTest() {
		// TODO Auto-generated constructor stub
	}

	public void server() {

	}

	public static void main(String[] args) {

		String a = "110.0952";
		BigDecimal b = BigDecimal.ZERO;
		b = new BigDecimal(a).multiply(new BigDecimal("100")).setScale(0, RoundingMode.HALF_EVEN);// 四舍五入
		BigDecimal c = new BigDecimal(a).multiply(new BigDecimal("100")).setScale(0, RoundingMode.HALF_EVEN);// 四舍五入
		
		if(b.compareTo(c)==0){
			System.out.println("b==c  "+b);
		}
		BigDecimal  repayment = new BigDecimal("0.000");
		
		if(repayment.compareTo(BigDecimal.ZERO)==0){
			System.out.println("无欠款");
		}
		System.out.println(repayment);
		System.out.println(BigDecimal.ZERO);
		
		String s = "{\"userId\":\"123\"}";
		JSONObject jsonObject = JSONObject.parseObject(s);
		jsonObject.put("mktPlan", "短信");
		String object = JSONObject.toJSONString(jsonObject);
		System.out.println(object);
		
		
		

		
	}

}
