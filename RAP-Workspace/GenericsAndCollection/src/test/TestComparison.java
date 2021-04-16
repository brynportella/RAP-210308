package test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestComparison {
	public static void main(String[] args) {
		Student a = new Student ("A", 2); 
		Student b = new Student ("B", 3); 
		Student c = new Student ("C", 1);
		Student d = new Student ("D", 8);
		Student e = new Student ("E", 4);
		System.out.println(a.compareTo(b));
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(a); 
		set.add(b); 
		set.add(e);
		set.add(c);
		set.add(d);
		
		
		set = new TreeSet<Student>(set);
		for(Student student: set) {
			System.out.println(student);
		}
		
		
		Set<Student> alphabeticalSet = new TreeSet<Student>(new AlphabetStudentComparer());
		alphabeticalSet.addAll(set); 
		for(Student student: alphabeticalSet) {
			System.out.println(student);
		}
	}
}
