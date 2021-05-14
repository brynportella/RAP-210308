package com.revature;

import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsumerImpl implements Consumer<Integer> {
	private static final Logger LOG = LogManager.getLogger(ConsumerImpl.class); 
	@Override
	public void accept(Integer t) {
		LOG.info(t);
	}

}
