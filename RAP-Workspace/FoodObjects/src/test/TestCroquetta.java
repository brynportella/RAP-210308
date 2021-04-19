package test;

import com.revature.model.Croquetta;

public class TestCroquetta{
	public static void main(String[] args) {
		
		Croquetta oxtailCroq = new Croquetta();
		
		oxtailCroq.setName("Oxtail");
		oxtailCroq.setCost(5.00);
		
		
		System.out.println("Flavor "+ oxtailCroq.getName() + " cost ="+ oxtailCroq.getCost());
		
		
	}
}
