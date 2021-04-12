package model;

import java.util.Arrays;

public class ArrayList {
	private int elements[] = new int[8];
	private int numberOfElements = 0; 

	public int get(int index) {
		return this.elements[index];
	}

	public void set(int index, int value) {
		this.elements[index] = value;
	}

	public int add(int value) {
		int index = numberOfElements;

		if(numberOfElements < elements.length) {
			elements[index] = value; 
			numberOfElements++;
			return index; 
		}

		// if here then we need to increase the size of the elements array
		int[] temp = new int[elements.length * 2];

		for (int i = 0; i < elements.length; i++) {
			temp[i] = elements[i];
		}

		// add in new value
		index = elements.length;
		temp[elements.length] = value;

		// copy temp to elements variable
		elements = temp;

		return index;
	}

	public int remove() {
		if(numberOfElements <= 0) {
			System.out.println("List is empty");
			return -1; 
		}else {
			return elements[--numberOfElements];
		}

	}
	
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements,0, numberOfElements)); 
	}
}