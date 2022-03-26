package cololection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map<String,Integer> m = new LinkedHashMap();
		m.put("MI",10);
		m.put("DC",20);
		m.put("CSK",30);
		m.put("KKR",40);
		
		System.out.println(m);
		
		Set<String> keySet = m.keySet();
		
		System.out.println(keySet);
		
		Collection<Integer> values = m.values();
		
		System.out.println(values);
		
		
	}

}
