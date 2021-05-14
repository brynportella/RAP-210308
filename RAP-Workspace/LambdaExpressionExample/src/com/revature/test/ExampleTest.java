package com.revature.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revature.Example;


public class ExampleTest {
	private Example example;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Before
	public void setUpTestObject() {
		example = new Example();
	}
	
	@Test 
	public void printListTest() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		
		String expected ="A\r\nB\r\nC\r\n"; 
		example.printItems(strings);
		assertEquals(expected, outContent.toString());
	}
	
	@Test 
	public void getListTest() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		
		String expected ="A B C "; 
		String actual = example.getList(strings);
		assertEquals(expected, actual);
	}
	
	@Test
	public void printTest() {
		String hello = "Hello"; 
		example.print(hello);
		String expected = hello+"\r\n"; 
		assertEquals(expected, outContent.toString()); 
	}
	
}
