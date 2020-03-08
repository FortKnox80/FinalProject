package cheesecakes;

//A class for raspberry cheesecakes
public class RaspberryDelightCheesecake extends Cheesecake {

	public RaspberryDelightCheesecake() {
		ordered = false;
		name = "Raspberry Delight Cheesecake";
		crust = "Buttery Graham Cracker";
		filling = "White Chocolate Mousse";
		toppings = "Raspberries with Sauce";
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
