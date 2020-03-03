package pies;

//A class for strawberry rhubarb pies
public class StrawberryRhubarbPie extends Pie {

	public StrawberryRhubarbPie() {
		ordered = false;
		name = "Strawberry Rhubarb Pie";
		filling = "Tangy Rhubarb With the Sweet Hint of Strawberries";
		crust = "Flakey, Buttery Crust Formed Into a Traditional Lattice Work";
	}

	//A method to bake the pie
	public Pie bakeAPie(String type) {
		Pie pie = bakeAPie(type);
		
		return pie;
	}

	//Set the pie cost
	public double cost() {
		
		return 100.00;
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
