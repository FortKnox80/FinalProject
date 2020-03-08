package pies;

//A class for blackberry pies
public class BlackberryPie extends Pie {

	public BlackberryPie() {
		ordered = false;
		name = "Handpicked Blackberry Pie";
		filling = "Fresh, Handpicked Blackerries ";
		crust = "Flakey, Buttery Crust Topped With Blackbird Art Work";
	}


	//Set the pie cost
	public double cost() {
		
		return 80.00;
	}
	
	//Place the pie order
	public boolean pieOrdered() {
		ordered = true;
		System.out.println("Order placed for a " + name + ".");
		return ordered;
	}
	
	//Cancel the pie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
