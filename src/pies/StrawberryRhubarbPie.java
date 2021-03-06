package pies;

//A class for strawberry rhubarb pies
public class StrawberryRhubarbPie extends Pie {

	public StrawberryRhubarbPie() {
		ordered = false;
		name = "Strawberry Rhubarb Pie";
		filling = "Tangy Rhubarb With the Sweet Hint of Strawberries";
		crust = "Flakey, Buttery Crust Formed Into a Traditional Lattice Work";
	}

	
	//Set the pie cost
	public double cost() {
		
		return 75.00;
	}
	
	//Place the pie order
	public boolean pieOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the pie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
