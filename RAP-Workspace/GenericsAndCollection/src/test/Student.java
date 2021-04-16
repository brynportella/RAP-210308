package test;

public class Student implements Comparable<Student>{
	String name; 
	long id; 
	
	
	//A.compareTo(B) 
	//If A is greater than B -- we should return a positive integer
	//A is equal to B -- we should return 0
	//A is less than B we should return a negative integer
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//A's id is bigger than B's id 
		int result = 1; 
		if(this.id - o.id >0) {
			result = 1;
		}else if (this.id == o.id) {
			result = 0; 
		}else {
			result = -1; 
		}
		
		return result ;
	}

	public Student(String name, long id) {
		this.name = name; 
		this.id = id; 
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
