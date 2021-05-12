package com.revature.test.services;

import  org.junit.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.exceptions.InvalidPlayerConfigException;
import com.revature.services.PlayerService;
import com.revature.services.PlayerServiceImpl;

public class PlayerServiceImplTest {
	
	private PlayerService service;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("Running once before all tests");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After Class");
	}
	
	@Before 
	public void setUpBefore() {
		System.out.println("Run before each test- create our service to be tested");
		service = new PlayerServiceImpl(); 
	}
	
	@After
	public void tearDown() {
		System.out.println("After test");
	}
	
	@Test
	public void testFormattedCleanlinessValueSuccess() {
		String successValue = "Cleanliness 0.60 %"; 
		double testValue = 0.6; 
		String result = service.formatedCleanlinessValue(testValue);
		System.out.println(result);
		System.out.println(successValue);
		Assert.assertEquals(successValue, result); 
	}
	@Test(expected = InvalidPlayerConfigException.class)
	public void testFormattedCleanlinessValueFailure() {
		String expectedException = "Expect an InvalidPlayerConfigException"; 
		double testValue = 1.6; 
		System.out.println(expectedException);
		String result = service.formatedCleanlinessValue(testValue);
		System.out.println(result);
		
	}
}
