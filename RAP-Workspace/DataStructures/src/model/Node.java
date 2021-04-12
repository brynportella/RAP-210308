package model;

public class Node {
	//Set up data
	private Integer data;
	//Set up reference
	private Node next = null; 
	
	//Constructors 
	public Node() {
		this.data = -1; 
	}
	//parameterized constructor
	public Node(Integer data) {
		this.data = data; 
	}
	
	//getters and setters 
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
