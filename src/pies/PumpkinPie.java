package pies;

//A class for pumpkin pies
public class PumpkinPie extends Pie {

	public PumpkinPie() {
		ordered = false;
		name = "Spiced Pumpkin Pie";
		filling = "Holiday Spiced Pumpkin Filling";
		crust = "Flakey, Buttery Crust With an Open Top and a Pretty Crust Based Pumpkin";
	}

	//Set the pie cost
	public double cost() {
		
		return 70.00;
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
