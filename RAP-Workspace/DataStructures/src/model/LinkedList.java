package model;

public class LinkedList {
	// store our data in nodes
	private Node head;

	// add a node onto the list
	public boolean add(Node newNode) {
		if (head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while (runner.getNext() != null) {
				runner = runner.getNext();
			}
			runner.setNext(newNode);
		}
		return true;
	}

	public boolean add(Integer value) {
		return add(new Node(value));
	}

	// remove a node from the list
	public Integer remove() {
		if (head != null) {
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			return temp.getData();
		} else {
			System.out.println("List is empty.");
			return -1;
		}
	}

	@Override
	public String toString() {
		String s = "LinkedList [";
		Node runner = head; 
		while(runner != null) {
			s+= runner.toString()+"-->"; 
			runner = runner.getNext(); 
		}
		s+= "null ]"; 
		return s;
	}
	
	// print it all out
	
}
