package cheesecakes;

//A class for strawberry cheesecakes
public class StrawberryCheesecake extends Cheesecake {

	public StrawberryCheesecake() {
		ordered = false;
		name = "Striking Strawberry Cheesecake";
		crust = "Vanilla Shortbread Crust";
		filling = "Tangy Vanilla Filling";
		toppings = "Strawberries with Sauce";
	}


	//Set the cheesecake cost
	public double cost() {
		
		return 80.00;
	}
	
	//Place the cheesecake order
	public boolean dessertOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the cheesecake order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
