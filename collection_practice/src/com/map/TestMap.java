package com.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("aa", 1);
		map.put("bb", 2);
		System.out.println(map);
	}

}
