package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestBuiltInCollection {
	public static void main(String[] args) {
		//Generics
		//Provide compile time type safety!!
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(3);
		list.add(3);
		list.add(3);
		System.out.println(list);
		//System.out.println(list.get(3));
		
		Iterator<Integer> it = list.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer currentElement: list) {
			System.out.println(currentElement);
		}
		
		Map<String, Student> myMap = new HashMap<String, Student> (); 
		
		Student a = new Student("A", 1); 
		Student b = new Student("B", 2);
		Student c = new Student("C", 3);
		myMap.put("A", a);
		myMap.put("B", b);
		myMap.put("C", c);
		
		System.out.println(myMap.get("A"));
		System.out.println(myMap);
		
		for(String key: myMap.keySet()) {
			System.out.println(key);
			System.out.println(myMap.get(key));
		}
		
		for(Entry<String, Student> entry: myMap.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
}
