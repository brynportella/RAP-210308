package test;

import java.util.Comparator;

public class AlphabetStudentComparer implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		String name1 = o1.name; 
		String name2 = o2.name; 
		int result = name1.compareTo(name2); 
		return result;
	}

}
