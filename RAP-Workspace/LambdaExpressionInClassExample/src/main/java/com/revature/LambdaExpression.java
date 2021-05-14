package com.revature;

import java.util.List;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LambdaExpression {
	private static final Logger LOG = LogManager.getLogger(LambdaExpression.class); 
	
	public void printWithoutLambda(List<Integer> list) {
		Consumer<Integer> consumer = new ConsumerImpl(); 
		list.forEach(consumer);
	}
	
	public void printWithLambda(List<Integer> list) {
		//argument list 
		//optionally specify the type 
		//optionally wrap it in parentheses 
		// arrow 
		// optionally this can be a block
		// optionally we may need to include the return keyword
		list.forEach(element -> System.out.println(element));
	}
	
	public void printWithLambdaAndLogger(List<Integer> list) {

		list.forEach(element -> LOG.info(element));
	}
}
