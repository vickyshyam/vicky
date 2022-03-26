package cololection;
// list method
import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		
		l.add(12);
		l.add(20);
		l.add(34);
		l.add(12);
		l.add(60);
		l.add(40);
		
		// to get all the values from the list
		
		System.out.println(l);
		
		//to get the size of the list
		
		int size = l.size();
		System.out.println(size);
		
		//to get the particular index from the list
		
		Integer integer = l.get(2);
		System.out.println(integer);
		
		//to add the value in the specific index
		
		l.add(4,100);
		System.out.println(l);
		
		// to remove the value in the specific index
		
		l.remove(2);
		System.out.println(l);
		
		//to replace the value in the list
		
		l.set(4,70);
		System.out.println(l);
		
		//to get the value of particular index (first occurrence)
		
		int indexOf = l.indexOf(100);
		System.out.println(indexOf);
		
		//to get the value of particular index (last occurrence)
		
		int lastIndexOf = l.lastIndexOf(40);
		System.out.println(lastIndexOf);
		
		
		//to check the list whether the particular value is present or not
		
		boolean contains = l.contains(13);
		System.out.println(contains);
	
		
		System.out.println(l);
		
		// to iterate the value in the list
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			
		}
			
		System.out.println("===================");
		
		// to iterate the list using enhanced for loop
		
		for (Integer t : l) {
			System.out.println(t);
			
		}
		
		
	}
	
	
	

	}

	

