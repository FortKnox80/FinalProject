package pies;

//A class for strawberry rhubarb pies
public class PecanPie extends Pie {

	public PecanPie() {
		ordered = false;
		name = "Grandma's Pecan Pie";
		filling = "Creamy, Rich Pecan Filling";
		crust = "Flakey, Buttery Crust With and Open Top and a Pretty Crust Based Leaf";
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
