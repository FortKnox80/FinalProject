package dessertShop;

public class PipedFlowers extends CakeDecorator {

	Cake cake;

	PipedFlowers(Cake cake) {
		this.cake = cake;
	}

	public String getCakeFlavor() {
		return cake.getCakeFlavor() + "adding some gorgeous buttercream flowers";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
