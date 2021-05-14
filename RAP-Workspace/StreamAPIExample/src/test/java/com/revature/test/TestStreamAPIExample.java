package com.revature.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.revature.StreamExample;

public class TestStreamAPIExample {
	private StreamExample ex;
	
	@Before
	public void setUp() {
		ex = new StreamExample();
	}
	
	@Test
	public void testSumSuccess() {
		ArrayList<Integer> numbersInput = new ArrayList<>();
		numbersInput.add(1); 
		numbersInput.add(1); 
		numbersInput.add(1); 
		
		assertEquals(3, ex.sum(numbersInput));
	}
	
	@Test
	public void testToUpperCaseSuccess() {
		List<String> input = new ArrayList<>();
		input.add("a");
		input.add("b");
		input.add("c");
		
		List<String> expectedOutput = new ArrayList<>();
		expectedOutput.add("A");
		expectedOutput.add("B");
		expectedOutput.add("C");
		List<String> result = ex.toUpperCaseContents(input);
		assertEquals(expectedOutput, result); 
	}
}
