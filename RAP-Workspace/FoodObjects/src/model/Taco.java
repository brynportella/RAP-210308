package model;

public class Taco {
	private String flavor; 
	private String tortilla ;
	private double cost; 

	//Constructors 
	public Taco() {
		this("veggie", "flour",3.00);
		System.out.println("Back in no args constructor");
	}
	
	public Taco(String f, String t, double c) {
	
		flavor = f; 
		tortilla = t;
		cost = c; 
	}
	
	//Getters and setters 
	//getter for flavor
	public String getFlavor() {
		return flavor; 
	}
	
	public void setFlavor(String f) {
		flavor = f; 
	}
	
	public String getTortilla() {
		return tortilla;
	}

	public void setTortilla(String tortilla) {
		this.tortilla = tortilla;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
}
