package model;

public class Taco  extends FoodItem {
	private String flavor; 
	private String tortilla ;
	

	//Constructors 
	public Taco() {
		this("veggie", "flour",3.00);
		System.out.println("Back in no args constructor");
	}
	
	public Taco(String f, String t, double c) {
	
		flavor = f; 
		tortilla = t;
		//setCost(c); 
		this.cost = c; 
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

	@Override
	public String toString() {
		return "Taco [flavor=" + flavor + ", tortilla=" + tortilla + ", name=" + name + ", cost=" + cost + "]";
	}

	
}
