package brownies;

//A class for chocolate fudge brownies
public class ChocolateFudgeBrownie extends Brownie {

	public ChocolateFudgeBrownie() {
		ordered = false;
		name = "Chocolate Fudge Brownie";
		brownieBase = "Rich Chocolate Brownie Base";
		fillings = "Creamy Dark Chocolate Fudge Swirl";
		
	}

	//Set the brownie cost
	public double cost() {
		
		return 95.00;
	}
	
	//Place the brownie order
	public boolean brownieOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the brownie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
