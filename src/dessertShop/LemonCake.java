package dessertShop;

public class LemonCake extends Cake {

	public LemonCake() {
		name = "Lemon Cake";
		filling = "Lemon Curd";
		icingFlavor = "Vanilla Buttercream";
	}

	public Cake bakeACake(String type) {
		Cake cake = bakeACake(type);
		
		return cake;
	}

	@Override
	public double cost() {
		
		return 100.00;
	}
	
	
	
}
