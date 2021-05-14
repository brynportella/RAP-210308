package com.revature;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StreamExample {
	private static final Logger LOG = LogManager.getLogger(StreamExample.class);
	
	public int sum(List<Integer> list) {
		//return list.stream().reduce(0, (currentSum, element)-> currentSum + element);
		LOG.info("The list is "+list); 
		return list.stream().reduce(0, (currentSum, element)->{return currentSum + element;});
	}
	
	public List<String> toUpperCaseContents(List<String> list){
		LOG.info("The list is "+list); 
		return list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	}
}
