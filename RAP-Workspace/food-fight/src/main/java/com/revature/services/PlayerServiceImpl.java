package com.revature.services;

import com.exceptions.InvalidPlayerConfigException;

public class PlayerServiceImpl implements PlayerService {

	@Override
	public String formatedCleanlinessValue(double percentageCleanliness) {
		if (percentageCleanliness > 1 || percentageCleanliness < 0) {
			throw new InvalidPlayerConfigException();
		}else {
			return String.format("Cleanliness %3.2f %%", percentageCleanliness); 
		}
	}
		
}
