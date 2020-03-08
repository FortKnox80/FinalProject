package dessertShop;


import brownies.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;
import macaroons.*;
import pies.*;
import commands.*;

public class POSConsole extends POSCenter {
	
	POSCenter pos = new POSCenter();
	
	//Set all the brownies and assign each to a console button number
	Brownie blondieBrownie = new BlondieBrownie();
	Brownie chocolateFudgeBrownie = new ChocolateFudgeBrownie();
	Brownie constellationBrownie = new ConstellationBrownie();
	Brownie whiteChocolateSwirlBrownie = new WhiteChocolateSwirlBrownie(); 
	
	final int blondieB = 0;
	final int fudgeB = 1;
	final int constB = 2;
	final int swirlB = 3;
	
	//Set all the cakes and assign each to a console button number
	Cake flourlessChocolateCake = new FlourlessChocolateCake();
	Cake galaxyCake = new GalaxyCake();
	Cake lemonCake = new LemonCake();
	Cake pinkChampagneCake = new PinkChampagneCake(); 
	Cake rainbowCake = new RainbowCake();
	Cake roseCake = new RoseCake();
	Cake vanillaBeanCake = new VanillaBeanCake(); 
	
	final int chocC = 4;
	final int galaxyC = 5;
	final int lemonC = 6;
	final int champC = 7;
	final int rainC = 8;
	final int roseC = 9;
	final int vanC = 10;
	
	//Set all the cheesecakes and assign each to a console button number
	Cheesecake blackberryCheesecake = new BlackberryCheesecake(); 
	Cheesecake blueberryCheesecake = new BlueberryCheesecake();
	Cheesecake raspberryDelightCheesecake = new RaspberryDelightCheesecake();
	Cheesecake strawberryCheesecake = new StrawberryCheesecake();
	Cheesecake decadentChocolateCheesecake = new DecadentChocolateCheesecake();
	
	final int blackCC = 11;
	final int  blueCC = 12;
	final int raspCC = 13;
	final int strawCC = 14;
	final int chocCC = 29;
	
	//Set all the cookies and assign each to a console button number
	Cookie frostedSugarCookie = new FrostedSugarCookie();
	Cookie gooeyChocolateChunkCookie = new GooeyChocolateChunkCookie();
	Cookie lavenderBlueberryCookie = new LavenderBlueberryCookie();
	Cookie lemonCookie = new LemonCookie();
	
	final int frostedCK = 15;
	final int  chocCK = 16;
	final int lavCK = 17;
	final int lemonCK = 18;
	
	//Set the macaroons and assign each to a console button number
	Macaroon lavenderMacaroon = new LavenderMacaroon();
	Macaroon lemonMacaroon = new LemonMacaroon ();
	Macaroon orangeCreamMacaroon = new OrangeCreamMacaroon();
	Macaroon raspberryMacaroon = new RaspberryMacaroon();
	Macaroon strawberryMacaroon = new StrawberryMacaroon();
	Macaroon vanillaMacaroon = new	VanillaMacaroon();
	
	final int lavM = 19;
	final int lemonM = 20;
	final int orangeM = 21;
	final int raspM = 22;
	final int strawM = 23;
	final int  vanM  = 24;
	
	
	//Set the pies and assign each to a console button number
	
	Pie blackberryPie = new BlackberryPie();
	Pie pecanPie = new PecanPie();
	Pie pumpkinPie = new PumpkinPie();
	Pie strawberryRhubarbPie = new StrawberryRhubarbPie();
	
	final int blackP = 25;
	final int pecanP = 26;
	final int pumpP = 27;
	final int strawRP = 28;
	
	//Create a place order and cancel order command for each dessert type
	
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
	
	//Set assign the desserts and their commands to the buttons on the console
	public POSConsole() {
		
		pos.setCommand(lemonC, placeLemonCakeOrder, cancelLemonCakeOrder);
		pos.setCommand(chocC, placeFlourlessChocolateCakeOrder, cancelFlourlessChocolateCakeCakeOrder);
		pos.setCommand(galaxyC, placeGalaxyCakeOrder, cancelGalaxyCakeOrder);
		pos.setCommand(champC, placePinkChampagneCakeOrder, cancelPinkChampagneCakeOrder);
		pos.setCommand(rainC, placeRainbowCakeOrder, cancelRainbowCakeOrder);
		pos.setCommand(roseC, placeRoseCakeOrder, cancelRoseCakeOrder);
		pos.setCommand(vanC, placeVanillaBeanCakeOrder, cancelVanillaBeanCakeOrder);
		
		pos.setCommand(blondieB, placeBlondieBrownieOrder, cancelBlondieBrownieOrder);
		pos.setCommand(fudgeB, placeChocolateFudgeBrownieOrder, cancelChocolateFudgeBrownieOrder);
		pos.setCommand(swirlB, placeWhiteChocolateSwirlBrownieOrder, cancelWhiteChocolateSwirlBrownieOrder);
		pos.setCommand(constB, placeConstellationBrownieOrder, cancelConstellationBrownieOrder);
		
		
		pos.setCommand(blackCC, placeBlackberryCheesecakeOrder, cancelBlackberryCheesecakeOrder);
		pos.setCommand(chocCC, placeDecadentChocolateCheesecakeOrder, cancelDecadentChocolateCheesecakeOrder);
		pos.setCommand(raspCC, placeRaspberryDelightCheesecakeOrder, cancelRaspberryDelightCheesecakeOrder);
		pos.setCommand(strawCC, placeStrawberryCheesecakeOrder, cancelStrawberryCheesecakeOrder);
		pos.setCommand(blueCC, placeBlueberryCheesecakeOrder, cancelBlueberryCheesecakeOrder);
		
		pos.setCommand(frostedCK, placeFrostedSugarCookieOrder, cancelFrostedSugarCookieOrder);
		pos.setCommand(chocCK, placeGooeyChocolateChunkCookieOrder, cancelGooeyChocolateChunkCookieOrder);
		pos.setCommand(lavCK, placeLavenderBlueberryCookieOrder, cancelLavenderBlueberryCookieOrder);
		pos.setCommand(lemonCK, placeLemonCookieOrder, cancelLemonCookieOrder);
		
		pos.setCommand(lavM, placeLavenderMacaroonOrder, cancelLavenderMacaroonOrder);
		pos.setCommand(lemonM, placeLemonMacaroonOrder, cancelLemonMacaroonOrder);
		pos.setCommand(orangeM, placeOrangeCreamMacaroonOrder, cancelOrangeCreamMacaroonOrder);
		pos.setCommand(raspM, placeRaspberryMacaroonOrder, cancelRaspberryMacaroonOrder);
		pos.setCommand(strawM, placeStrawberryMacaroonOrder, cancelStrawberryMacaroonOrder);
		pos.setCommand(vanM, placeVanillaMacaroonOrder, cancelVanillaMacaroonOrder);
		
		pos.setCommand(blackP, placeBlackberryPieOrder, cancelBlackberryPieOrder);
		pos.setCommand(pecanP, placePecanPieOrder, cancelPecanPieOrder);
		pos.setCommand(pumpP, placePumpkinPieOrder, cancelPumpkinPieOrder);
		pos.setCommand(strawRP, placeStrawberryRhubarbPieOrder, cancelStrawberryRhubarbPieOrder);
	}
	
	//A method for placing an order
	public void orderButtonPushed(int slot) {
		 pos.orderButtonPushed(slot);
	}

	//a mehtod for cancelling an order
	public void cancelOrderButtonPushed(int slot) {
		pos.cancelOrderButtonPushed(slot);
	}
}
