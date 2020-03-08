package brownies;

//A class for chocolate swirl brownies
public class WhiteChocolateSwirlBrownie extends Brownie {

	public WhiteChocolateSwirlBrownie() {
		ordered = false;
		name = "White Chocolate Swirl Brownie";
		brownieBase = "Rich Chocolate Brownie Base";
		fillings = "A Creamy White Chocolate Fudge Swirl";
		
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
