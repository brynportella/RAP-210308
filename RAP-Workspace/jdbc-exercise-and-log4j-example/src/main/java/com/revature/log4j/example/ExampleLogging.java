package com.revature.log4j.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleLogging {
	private static final Logger LOG = 
			LogManager.getLogger(ExampleLogging.class); 
	
	public static void main(String[] args) {
		LOG.trace("TRACE MESSAGE");
		LOG.debug("DEBUG MESSAGE");
		LOG.info("INFO MESSAGE");
		LOG.warn("WARN MESSAGE");
		LOG.error("ERROR MESSAGE");
		LOG.fatal("FATAL MESSAGE");
	}
}
