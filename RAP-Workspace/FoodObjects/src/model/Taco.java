package model;

public class Taco {
	String flavor; 
	String tortilla ;
	double cost; 

	
	public Taco() {
		flavor = "veggie";
		tortilla = "flour";
		cost = 3.00; 
	}
	
	public Taco(String f, String t, double c) {
		flavor = f; 
		tortilla = t;
		cost = c; 
	}
	
	public static void main(String[] args) {
		Taco bell; 
		//initialized our bell reference variable
		//by instantiating our Taco class
		//to instantiate a class you create an object from that class. 
		bell = new Taco("beef", "flour", 1.00); 
		
		System.out.println("Bell: flavor="+bell.flavor
				+" tortilla="+bell.tortilla+" cost ="+bell.cost);
	}
}
