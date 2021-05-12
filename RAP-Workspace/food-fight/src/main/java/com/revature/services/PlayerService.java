package com.revature.services;

/*
 * Service for dealing with Player objects 
 * 
 * Making sure that the cleanliness is valid and updating the result in the database
 * 
 * Handling catching tossed items
 * 
 * handling throwing/tossing items
 * 
 * 
 */
public interface PlayerService {
	
	//Little bit of a stretch to have it here, but it is related to the proper use of player objects...
	public String formatedCleanlinessValue(double percentageCleanliness);
}
