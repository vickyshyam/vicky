package cololection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		  //syntex
		//Map<key,value> m = new LinkedHasMap();
		
		Map<String,Integer> m = new LinkedHashMap();
		
		m.put("v",10);
		m.put("i",20);
		m.put("c",30);
		m.put("k",40);
		m.put("y",50);
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		//to get integer value
		Integer integer = m.get("v");
		System.out.println(integer);
		
		//contains key
		boolean containsKey = m.containsKey("c");
		System.out.println(containsKey);
		
		//contains value
		boolean containsValue = m.containsValue(40);
		System.out.println(containsValue);
		
		//remove the key
		m.remove("v");
		System.out.println(m);
		
		//to get key set only
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		//to get values set only
		Collection<Integer> values = m.values();
		System.out.println(values);
		
		//  to iterate the value
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> x : entrySet) {
		System.out.println(x);
		
		
		String key = x.getKey();
		System.out.println(key);
		
		Integer value = x.getValue();
		System.out.println(value);
		
		
		
		}
		
		
		
		
		
	}
	
}
