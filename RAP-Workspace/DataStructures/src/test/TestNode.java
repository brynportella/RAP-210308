package test;

import model.Node;

public class TestNode {
	public static void main(String[] args) {
		Node one = new Node(1); 
		Node two = new Node(2); 
		Node three = new Node(3); 
		one.setNext(two);
		two.setNext(three);
		
		Node runner = one;
		
		while(runner != null) {
			System.out.print(runner+"-->");
			runner = runner.getNext(); 
		}
		System.out.println("null");
	}
}
