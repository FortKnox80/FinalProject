package pies;

//An abstract class for all of the pies
public abstract class Pie {
	
	//Has the pie been ordered
	public boolean ordered;
	
	public String name;
	
	public String filling;
	public String crust;
	
	//Get the pie name
	public String getName() {
		return name;
	}

	//Get the flavor
	public String getPieFlavor() {
		return "A " + name + " "+ crust + " " + filling + " pie: ";
	}
	
	//Method for ordering a pie
	public boolean pieOrdered() {
		System.out.println("Your order has been placed");
		ordered = true;
		return ordered;
	}
	
	//Method for canceling a pie order
	public void cancelOrder() {
		System.out.println("Your order has been canceled");
		ordered = false;
	}
	
	//Method to prepare a pie
	public void preparePie() {
		System.out.println("We are preparing your pie now.");
	}
	
	//How much does the pie cost
	public abstract double cost();
}
	
