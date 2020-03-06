package dessertShop;


import brownies.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;
import decorations.*;
import macaroons.*;
import pies.*;


import commands.CancelOrderCommand;
import commands.PlaceCakeOrderCommand;
import commands.PlaceOrderCommand;

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
	RoseCake roseCake = new RoseCake();
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
	LavenderBlueberryCookie lavenderBlueberryCookie = new LavenderBlueberryCookie();
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
	
	
	
	PlaceOrderCommand placeLemonCakeOrder = new PlaceOrderCommand(lemonCake);
	CancelOrderCommand cancelLemonCakeOrder = new CancelOrderCommand(lemonCake);
	
	PlaceOrderCommand placeFlourlessChocolateCakeOrder = new PlaceOrderCommand(flourlessChocolateCake);
	CancelOrderCommand canceFlourlessChocolateCakeCakeOrder = new CancelOrderCommand(flourlessChocolateCake);
	
	PlaceOrderCommand placeGalaxyCakeOrder = new PlaceOrderCommand(galaxyCake);
	CancelOrderCommand cancelGalaxyCakeOrder = new CancelOrderCommand(galaxyCake);
	
	PlaceOrderCommand placePinkChampagneCakeOrder = new PlaceOrderCommand(pinkChampagneCake);
	CancelOrderCommand cancelPinkChampagneCakeOrder = new CancelOrderCommand(pinkChampagneCake);
	
	PlaceOrderCommand placeRainbowCakeOrder = new PlaceOrderCommand(rainbowCake);
	CancelOrderCommand cancelRainbowCakeOrder = new CancelOrderCommand(rainbowCake);
	
	PlaceOrderCommand placeRoseCakeOrder = new PlaceOrderCommand(roseCake);
	CancelOrderCommand cancelRoseCakeOrder = new CancelOrderCommand(roseCake);
	
	PlaceOrderCommand placeVanillaBeanCakeOrder = new PlaceOrderCommand(vanillaBeanCake);
	CancelOrderCommand cancelVanillaBeanCakeOrder = new CancelOrderCommand(vanillaBeanCake);
	
	
	
	PlaceOrderCommand placeBlondieBrownieOrder = new PlaceOrderCommand(blondieBrownie);
	CancelOrderCommand cancelBlondieBrownieOrder = new CancelOrderCommand(blondieBrownie);
	
	PlaceOrderCommand placeChocolateFudgeBrownieOrder = new PlaceOrderCommand(chocolateFudgeBrownie);
	CancelOrderCommand cancelChocolateFudgeBrownieOrder = new CancelOrderCommand(chocolateFudgeBrownie);
	
	PlaceOrderCommand placeConstellationBrownieOrder = new PlaceOrderCommand(constellationBrownie);
	CancelOrderCommand cancelConstellationBrownieOrder = new CancelOrderCommand(constellationBrownie);
	
	PlaceOrderCommand placeWhiteChocolateSwirlBrownieOrder = new PlaceOrderCommand(whiteChocolateSwirlBrownie);
	CancelOrderCommand cancelWhiteChocolateSwirlBrownieOrder = new CancelOrderCommand(whiteChocolateSwirlBrownie);
	
	PlaceOrderCommand placeBlackberryCheesecakeOrder = new PlaceOrderCommand(blackberryCheesecake);
	CancelOrderCommand cancelBlackberryCheesecakeOrder = new CancelOrderCommand(blackberryCheesecake);
	
	PlaceOrderCommand placeBlueberryCheesecakeOrder = new PlaceOrderCommand(blueberryCheesecake);
	CancelOrderCommand cancelBlueberryCheesecakeOrder = new CancelOrderCommand(blueberryCheesecake);
	
	PlaceOrderCommand placeDecadentChocolateCheesecakeOrder = new PlaceOrderCommand(decadentChocolateCheesecake);
	CancelOrderCommand cancelDecadentChocolateCheesecakeOrder = new CancelOrderCommand(decadentChocolateCheesecake);
	
	PlaceOrderCommand placeRaspberryDelightCheesecakeOrder = new PlaceOrderCommand(raspberryDelightCheesecake);
	CancelOrderCommand cancelRaspberryDelightCheesecakeOrder = new CancelOrderCommand(raspberryDelightCheesecake);
	
	PlaceOrderCommand placeStrawberryCheesecakeOrder = new PlaceOrderCommand(strawberryCheesecake);
	CancelOrderCommand cancelStrawberryCheesecakeOrder = new CancelOrderCommand(strawberryCheesecake);
	
	PlaceOrderCommand placeFrostedSugarCookieOrder = new PlaceOrderCommand(frostedSugarCookie);
	CancelOrderCommand cancelFrostedSugarCookieOrder = new CancelOrderCommand(frostedSugarCookie);
	
	
	PlaceOrderCommand placeGooeyChocolateChunkCookieOrder = new PlaceOrderCommand(gooeyChocolateChunkCookie);
	CancelOrderCommand cancelGooeyChocolateChunkCookieOrder = new CancelOrderCommand(gooeyChocolateChunkCookie);
	
	PlaceOrderCommand placeLavenderBlueberryCookieOrder = new PlaceOrderCommand(lavenderBlueberryCookie);
	CancelOrderCommand cancelLavenderBlueberryCookieOrder = new CancelOrderCommand(lavenderBlueberryCookie);
	
	PlaceOrderCommand placeLemonCookieOrder = new PlaceOrderCommand(lemonCookie);
	CancelOrderCommand cancelLemonCookieOrder = new CancelOrderCommand(lemonCookie);
	
	PlaceOrderCommand placeLavenderMacaroonOrder = new PlaceOrderCommand(lavenderMacaroon);
	CancelOrderCommand cancelLavenderMacaroonOrder = new CancelOrderCommand(lavenderMacaroon);
	
	PlaceOrderCommand placeLemonMacaroonOrder = new PlaceOrderCommand(lemonMacaroon);
	CancelOrderCommand cancelLemonMacaroonOrder = new CancelOrderCommand(lemonMacaroon);
	
	PlaceOrderCommand placeOrder = new PlaceOrderCommand();
	CancelOrderCommand cancelOrder = new CancelOrderCommand();
	
	PlaceOrderCommand placeOrder = new PlaceOrderCommand();
	CancelOrderCommand cancelOrder = new CancelOrderCommand();
	
	
	OrangeCreamMacaroon orangeCreamMacaroon = new OrangeCreamMacaroon();
	RaspberryMacaroon raspberryMacaroon = new RaspberryMacaroon();
	StrawberryMacaroon strawberryMacaroon = new StrawberryMacaroon();
	VanillaMacaroon	vanillaMacaroon = new	VanillaMacaroon();
	
	//Set the pies
	BlackberryPie blackberryPie = new BlackberryPie();
	PecanPie pecanPie = new PecanPie();
	PumpkinPie pumpkinPie = new PumpkinPie();
	StrawberryRhubarbPie strawberryRhubarbPie = new StrawberryRhubarbPie();
	
	
	
	
	PlaceOrderCommand placeOrder = new PlaceOrderCommand();
	CancelOrderCommand cancelOrder = new CancelOrderCommand();
	
	PlaceOrderCommand placeOrder = new PlaceOrderCommand();
	CancelOrderCommand cancelOrder = new CancelOrderCommand();
	
	PlaceOrderCommand placeOrder = new PlaceOrderCommand();
	CancelOrderCommand cancelOrder = new CancelOrderCommand();
	
	PlaceOrderCommand placeOrder = new PlaceOrderCommand();
	CancelOrderCommand cancelOrder = new CancelOrderCommand();
	
	
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
