package dessertShop;

public class LemonCake extends Cake {

	public LemonCake() {
		ordered = false;
		name = "Lemon Cake";
		filling = "Lemon Curd";
		icingFlavor = "Vanilla Buttercream";
		fondant = "Soft Yellow Fondant";
	}

	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}


	public double cost() {
		
		return 100.00;
	}
	
	public boolean cakeOrdered() {
		ordered = true;
		System.out.println("Order placed for a delicious lemon cake.");
		return ordered;
	}
	
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your lemon cake order has been canceled.");
		return ordered;
	}
	
}
