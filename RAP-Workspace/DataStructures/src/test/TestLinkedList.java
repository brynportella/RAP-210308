package test;

import model.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		System.out.println(list);
		Integer removedItem = list.remove(); 
		System.out.printf("\nRemoved: %d \n\nFrom:\n%s", removedItem, list);
	}
}
