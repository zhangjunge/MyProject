package com.dove.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSortTest{
	
	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("name", "gege");
		map.put("pass", "gege");
		map.put("adb", "gege");
		map.put("hhh", "gege");
		map.put("tsgdd", "gege");
		System.out.println(map.toString());
		
		
		Map<String,String> hash = new HashMap<String,String>();
		hash.put("name", "gege");
		hash.put("pass", "gege");
		hash.put("bd", "gege");
		hash.put("abc", "gege");
		hash.put("tsgdd", "gege");
		System.out.println(hash.toString());
		
		
		String destory = "";
		System.out.println(destory);
		
		
	}
	
}