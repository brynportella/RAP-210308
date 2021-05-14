package com.revature.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Before;
import org.junit.Test;

import com.revature.ConsumerImpl;
import com.revature.LambdaExpression;

public class TestConsumerImpl {
	private Consumer<Integer> consumer;
	private LambdaExpression ex; 
	
	@Before 
	public void setUp() {
		consumer= new ConsumerImpl(); 
		ex = new LambdaExpression();
	}
	
	@Test
	public void testConsumerImplAcceptSuccess() {
		Integer data = 5; 
		consumer.accept(data);
	}
	
	@Test
	public void testConsumerImplAcceptWithForEach() {
		List<Integer> list = Arrays.asList(1,2,3); 
		ex.printWithoutLambda(list);
	}
	
	@Test
	public void testLamdbaExpressionSuccess() {
		List<Integer> list = Arrays.asList(1,2,3); 
		ex.printWithLambda(list);
	}
	
	@Test
	public void testLamdbaExpressionLoggerSuccess() {
		List<Integer> list = Arrays.asList(1,2,3); 
		ex.printWithLambdaAndLogger(list);
	}
}
