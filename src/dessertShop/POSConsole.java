package dessertShop;


import brownies.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;
import decorations.*;
import macaroons.*;
import pies.*;


import commands.CancelCakeOrderCommand;
import commands.PlaceCakeOrderCommand;

public class POSConsole extends POSCenter {
	
	POSCenter pos = new POSCenter();
	
	//Set all the brownies
	BlondieBrownie blondieBrownie = new BlondieBrownie();
	ChocolateFudgeBrownie chocolateFudgeBrownie = new ChocolateFudgeBrownie();
	ConstellationBrownie constellationBrownie = new ConstellationBrownie();
	WhiteChocolateSwirlBrownie whiteChocolateSwirlBrownie = new WhiteChocolateSwirlBrownie(); 
	
	//Set all the cakes
	FlourlessChocolateCake flourlessChocolateCake = new FlourlessChocolateCake();
	GalaxyCake galaxyCake = new GalaxyCake();
	LemonCake lemonCake = new LemonCake();
	PinkChampagneCake pinkChampagneCake = new PinkChampagneCake(); 
	RainbowCake rainbowCake = new RainbowCake();
	RoseCake RoseCake = new RoseCake();
	VanillaBeanCake vanillaBeanCake = new VanillaBeanCake(); 
	
	//Set all the cheesecakes
	BlackberryCheesecake blackberryCheesecake = new BlackberryCheesecake(); 
	BlueberryCheesecake blueberryCheesecake = new BlueberryCheesecake();
	DecadentChocolateCheesecake decadentChocolateCheesecake = new DecadentChocolateCheesecake();
	RaspberryDelightCheesecake raspberryDelightCheesecake = new RaspberryDelightCheesecake();
	StrawberryCheesecake strawberryCheesecake = new StrawberryCheesecake();
	
	//Set all the cookies
	FrostedSugarCookie frostedSugarCookie = new FrostedSugarCookie();
	GooeyChocolateChunkCookie gooeyChocolateChunkCookie = new GooeyChocolateChunkCookie();
	LavenderBlueberryCookie LavenderBlueberryCookie = new LavenderBlueberryCookie();
	LemonCookie lemonCookie = new LemonCookie();
	
	//Set the macaroons
	LavenderMacaroon lavenderMacaroon = new LavenderMacaroon();
	LemonMacaroon lemonMacaroon = new LemonMacaroon ();
	OrangeCreamMacaroon orangeCreamMacaroon = new OrangeCreamMacaroon();
	RaspberryMacaroon raspberryMacaroon = new RaspberryMacaroon();
	StrawberryMacaroon strawberryMacaroon = new StrawberryMacaroon();
	VanillaMacaroon	vanillaMacaroon = new	VanillaMacaroon();
	
	//Set the pies
	BlackberryPie blackberryPie = new BlackberryPie();
	PecanPie pecanPie = new PecanPie();
	PumpkinPie pumpkinPie = new PumpkinPie();
	StrawberryRhubarbPie strawberryRhubarbPie = new StrawberryRhubarbPie();
	
	
	
	PlaceCakeOrderCommand placeLemonCakeOrder = new PlaceCakeOrderCommand(lemonCake);
	CancelCakeOrderCommand cancelLemonCakeOrder = new CancelCakeOrderCommand(lemonCake);
	
	PlaceCakeOrderCommand placeFlourlessChocolateCakeOrder = new PlaceCakeOrderCommand(flourlessChocolateCake);
	CancelCakeOrderCommand canceFlourlessChocolateCakeCakeOrder = new CancelCakeOrderCommand(flourlessChocolateCake);
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	GalaxyCake galaxyCake = new GalaxyCake();
	LemonCake lemonCake = new LemonCake();
	PinkChampagneCake pinkChampagneCake = new PinkChampagneCake(); 
	RainbowCake rainbowCake = new RainbowCake();
	RoseCake RoseCake = new RoseCake();
	VanillaBeanCake vanillaBeanCake = new VanillaBeanCake(); 
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	PlaceCakeOrderCommand placeOrder = new PlaceCakeOrderCommand();
	CancelCakeOrderCommand cancelOrder = new CancelCakeOrderCommand();
	
	
	public POSConsole() {

		pos.setCommand(0, placeLemonCakeOrder, cancelLemonCakeOrder);
		
	}
	
	public void orderButtonPushed(int slot) {
		pos.orderButtonPushed(slot);
	}

	public void cancelOrderButtonPushed(int slot) {
		pos.cancelOrderButtonPushed(slot);

	}
}
