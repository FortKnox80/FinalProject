package pies;

//A class for pecan pies
public class PecanPie extends Pie {

	public PecanPie() {
		ordered = false;
		name = "Grandma's Pecan Pie";
		filling = "Creamy, Rich Pecan Filling";
		crust = "Flakey, Buttery Crust With an Open Top and a Pretty Crust Based Leaf";
	}

	//Set the pie cost
	public double cost() {
		
		return 70.00;
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
