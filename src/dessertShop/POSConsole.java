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
	CancelOrderCommand cancelFlourlessChocolateCakeCakeOrder = new CancelOrderCommand(flourlessChocolateCake);
	
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
	
	PlaceOrderCommand placeOrangeCreamMacaroonOrder = new PlaceOrderCommand(orangeCreamMacaroon);
	CancelOrderCommand cancelOrangeCreamMacaroonOrder = new CancelOrderCommand(orangeCreamMacaroon);
	
	PlaceOrderCommand placeRaspberryMacaroonOrder = new PlaceOrderCommand(raspberryMacaroon);
	CancelOrderCommand cancelRaspberryMacaroonOrder = new CancelOrderCommand(raspberryMacaroon);

	PlaceOrderCommand placeStrawberryMacaroonOrder = new PlaceOrderCommand(strawberryMacaroon);
	CancelOrderCommand cancelStrawberryMacaroonOrder = new CancelOrderCommand(strawberryMacaroon);
	
	PlaceOrderCommand placeVanillaMacaroonOrder = new PlaceOrderCommand(vanillaMacaroon);
	CancelOrderCommand cancelVanillaMacaroonOrder = new CancelOrderCommand(vanillaMacaroon);
	
	PlaceOrderCommand placeBlackberryPieOrder = new PlaceOrderCommand(blackberryPie);
	CancelOrderCommand cancelBlackberryPieOrder = new CancelOrderCommand(blackberryPie);
	
	PlaceOrderCommand placePecanPieOrder = new PlaceOrderCommand(pecanPie);
	CancelOrderCommand cancelPecanPieOrder = new CancelOrderCommand(pecanPie);
	
	PlaceOrderCommand placePumpkinPieOrder = new PlaceOrderCommand(pumpkinPie);
	CancelOrderCommand cancelPumpkinPieOrder = new CancelOrderCommand(pumpkinPie);
	
	PlaceOrderCommand placeStrawberryRhubarbPieOrder = new PlaceOrderCommand(strawberryRhubarbPie);
	CancelOrderCommand cancelStrawberryRhubarbPieOrder = new CancelOrderCommand(strawberryRhubarbPie);
	
	
	
	

	public POSConsole() {
		
		pos.setCommand(0, placeLemonCakeOrder, cancelLemonCakeOrder);
		pos.setCommand(2, placeFlourlessChocolateCakeOrder, cancelFlourlessChocolateCakeCakeOrder);
		pos.setCommand(3, placeGalaxyCakeOrder, cancelGalaxyCakeOrder);
		pos.setCommand(4, placePinkChampagneCakeOrder, cancelPinkChampagneCakeOrder);
		pos.setCommand(5, placeRainbowCakeOrder, cancelRainbowCakeOrder);
		pos.setCommand(6, placeRoseCakeOrder, cancelRoseCakeOrder);
		pos.setCommand(7, placeVanillaBeanCakeOrder, cancelVanillaBeanCakeOrder);
		pos.setCommand(8, placeBlondieBrownieOrder, cancelBlondieBrownieOrder);
		pos.setCommand(9, placeChocolateFudgeBrownieOrder, cancelChocolateFudgeBrownieOrder);
		pos.setCommand(10, placeWhiteChocolateSwirlBrownieOrder, cancelWhiteChocolateSwirlBrownieOrder);
		pos.setCommand(11, placeBlackberryCheesecakeOrder, cancelBlackberryCheesecakeOrder);
		pos.setCommand(12, placeDecadentChocolateCheesecakeOrder, cancelDecadentChocolateCheesecakeOrder);
		pos.setCommand(13, placeRaspberryDelightCheesecakeOrder, cancelRaspberryDelightCheesecakeOrder);
		pos.setCommand(14, placeStrawberryCheesecakeOrder, cancelStrawberryCheesecakeOrder);
		pos.setCommand(15, placeFrostedSugarCookieOrder, cancelFrostedSugarCookieOrder);
		pos.setCommand(16, placeGooeyChocolateChunkCookieOrder, cancelGooeyChocolateChunkCookieOrder);
		pos.setCommand(17, placeLavenderBlueberryCookieOrder, cancelLavenderBlueberryCookieOrder);
		pos.setCommand(18, placeLemonCookieOrder, cancelLemonCookieOrder);
		pos.setCommand(19, placeLavenderMacaroonOrder, cancelLavenderMacaroonOrder);
		pos.setCommand(20, placeLemonMacaroonOrder, cancelLemonMacaroonOrder);
		pos.setCommand(21, placeOrangeCreamMacaroonOrder, cancelOrangeCreamMacaroonOrder);
		pos.setCommand(22, placeRaspberryMacaroonOrder, cancelRaspberryMacaroonOrder);
		pos.setCommand(23, placeStrawberryMacaroonOrder, cancelStrawberryMacaroonOrder);
		pos.setCommand(24, placeVanillaMacaroonOrder, cancelVanillaMacaroonOrder);
		pos.setCommand(25, placeBlackberryPieOrder, cancelBlackberryPieOrder);
		pos.setCommand(26, placePecanPieOrder, cancelPecanPieOrder);
		pos.setCommand(27, placePumpkinPieOrder, cancelPumpkinPieOrder);
		pos.setCommand(28, placeStrawberryRhubarbPieOrder, cancelStrawberryRhubarbPieOrder);
		pos.setCommand(29, placeConstellationBrownieOrder, cancelConstellationBrownieOrder);
		pos.setCommand(30, placeBlueberryCheesecakeOrder, cancelBlueberryCheesecakeOrder);
	}
	
	public void orderButtonPushed(int slot) {
		pos.orderButtonPushed(slot);
	}

	public void cancelOrderButtonPushed(int slot) {
		pos.cancelOrderButtonPushed(slot);
	}
}
