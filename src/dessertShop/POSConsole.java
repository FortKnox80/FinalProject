package dessertShop;


import brownies.*;
import cakeDecoarations.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;
import macaroons.*;
import pies.*;
import commands.*;

public class POSConsole extends POSCenter {
	
	POSCenter pos = new POSCenter();
	
	//Set all the brownies
	Brownie blondieBrownie = new BlondieBrownie();
	Brownie chocolateFudgeBrownie = new ChocolateFudgeBrownie();
	Brownie constellationBrownie = new ConstellationBrownie();
	Brownie whiteChocolateSwirlBrownie = new WhiteChocolateSwirlBrownie(); 
	
	final static int blondieB = 0;
	final static int fudgeB = 1;
	final static int constB = 2;
	final static int swirlB = 3;
	
	//Set all the cakes
	Cake flourlessChocolateCake = new FlourlessChocolateCake();
	Cake galaxyCake = new GalaxyCake();
	Cake lemonCake = new LemonCake();
	Cake pinkChampagneCake = new PinkChampagneCake(); 
	Cake rainbowCake = new RainbowCake();
	Cake roseCake = new RoseCake();
	Cake vanillaBeanCake = new VanillaBeanCake(); 
	
	final static int chocC = 4;
	final static int galaxyC = 5;
	final static int lemonC = 6;
	final static int champC = 7;
	final static int rainC = 8;
	final static int vanC = 9;
	
	//Set all the cheesecakes
	Cheesecake blackberryCheesecake = new BlackberryCheesecake(); 
	Cheesecake blueberryCheesecake = new BlueberryCheesecake();
	Cheesecake raspberryDelightCheesecake = new RaspberryDelightCheesecake();
	Cheesecake strawberryCheesecake = new StrawberryCheesecake();
	
	final static int blackCC = 10;
	final static int  blueCC = 11;
	final static int raspCC = 12;
	final static int sttrawCC = 13;
	
	//Set all the cookies
	Cookie frostedSugarCookie = new FrostedSugarCookie();
	Cookie gooeyChocolateChunkCookie = new GooeyChocolateChunkCookie();
	Cookie lavenderBlueberryCookie = new LavenderBlueberryCookie();
	Cookie lemonCookie = new LemonCookie();
	
	final static int frostedCK = 14;
	final static int  chocCK = 15;
	final static int lavCK = 16;
	final static int lemonCK = 17;
	
	//Set the macaroons
	Macaroon lavenderMacaroon = new LavenderMacaroon();
	Macaroon lemonMacaroon = new LemonMacaroon ();
	Macaroon orangeCreamMacaroon = new OrangeCreamMacaroon();
	Macaroon raspberryMacaroon = new RaspberryMacaroon();
	Macaroon strawberryMacaroon = new StrawberryMacaroon();
	Macaroon	vanillaMacaroon = new	VanillaMacaroon();
	
	//Set the pies
	Pie blackberryPie = new BlackberryPie();
	Pie pecanPie = new PecanPie();
	Pie pumpkinPie = new PumpkinPie();
	Pie strawberryRhubarbPie = new StrawberryRhubarbPie();
	
	
	PlaceCakeOrderCommand placeLemonCakeOrder = new PlaceCakeOrderCommand(lemonCake);
	CancelCakeOrderCommand cancelLemonCakeOrder = new CancelCakeOrderCommand(lemonCake);
	
	PlaceCakeOrderCommand placeFlourlessChocolateCakeOrder = new PlaceCakeOrderCommand(flourlessChocolateCake);
	CancelCakeOrderCommand cancelFlourlessChocolateCakeCakeOrder = new CancelCakeOrderCommand(flourlessChocolateCake);
	
	PlaceCakeOrderCommand placeGalaxyCakeOrder = new PlaceCakeOrderCommand(galaxyCake);
	CancelCakeOrderCommand cancelGalaxyCakeOrder = new CancelCakeOrderCommand(galaxyCake);
	
	PlaceCakeOrderCommand placePinkChampagneCakeOrder = new PlaceCakeOrderCommand(pinkChampagneCake);
	CancelCakeOrderCommand cancelPinkChampagneCakeOrder = new CancelCakeOrderCommand(pinkChampagneCake);
	
	PlaceCakeOrderCommand placeRainbowCakeOrder = new PlaceCakeOrderCommand(rainbowCake);
	CancelCakeOrderCommand cancelRainbowCakeOrder = new CancelCakeOrderCommand(rainbowCake);
	
	PlaceCakeOrderCommand placeRoseCakeOrder = new PlaceCakeOrderCommand(roseCake);
	CancelCakeOrderCommand cancelRoseCakeOrder = new CancelCakeOrderCommand(roseCake);
	
	PlaceCakeOrderCommand placeVanillaBeanCakeOrder = new PlaceCakeOrderCommand(vanillaBeanCake);
	CancelCakeOrderCommand cancelVanillaBeanCakeOrder = new CancelCakeOrderCommand(vanillaBeanCake);
	
	PlaceBrownieOrderCommand placeBlondieBrownieOrder = new PlaceBrownieOrderCommand(blondieBrownie);
	CancelBrownieOrderCommand cancelBlondieBrownieOrder = new CancelBrownieOrderCommand(blondieBrownie);
	
	PlaceBrownieOrderCommand placeChocolateFudgeBrownieOrder = new PlaceBrownieOrderCommand(chocolateFudgeBrownie);
	CancelBrownieOrderCommand cancelChocolateFudgeBrownieOrder = new CancelBrownieOrderCommand(chocolateFudgeBrownie);
	
	PlaceBrownieOrderCommand placeConstellationBrownieOrder = new PlaceBrownieOrderCommand(constellationBrownie);
	CancelBrownieOrderCommand cancelConstellationBrownieOrder = new CancelBrownieOrderCommand(constellationBrownie);
	
	PlaceBrownieOrderCommand placeWhiteChocolateSwirlBrownieOrder = new PlaceBrownieOrderCommand(whiteChocolateSwirlBrownie);
	CancelBrownieOrderCommand cancelWhiteChocolateSwirlBrownieOrder = new CancelBrownieOrderCommand(whiteChocolateSwirlBrownie);
	
	PlaceCheesecakeOrderCommand placeBlackberryCheesecakeOrder = new PlaceCheesecakeOrderCommand(blackberryCheesecake);
	CancelCheesecakeOrderCommand cancelBlackberryCheesecakeOrder = new CancelCheesecakeOrderCommand(blackberryCheesecake);
	
	PlaceCheesecakeOrderCommand placeBlueberryCheesecakeOrder = new PlaceCheesecakeOrderCommand(blueberryCheesecake);
	CancelCheesecakeOrderCommand cancelBlueberryCheesecakeOrder = new CancelCheesecakeOrderCommand(blueberryCheesecake);
	
	PlaceCheesecakeOrderCommand placeDecadentChocolateCheesecakeOrder = new PlaceCheesecakeOrderCommand(decadentChocolateCheesecake);
	CancelCheesecakeOrderCommand cancelDecadentChocolateCheesecakeOrder = new CancelCheesecakeOrderCommand(decadentChocolateCheesecake);
	
	PlaceCheesecakeOrderCommand placeRaspberryDelightCheesecakeOrder = new PlaceCheesecakeOrderCommand(raspberryDelightCheesecake);
	CancelCheesecakeOrderCommand cancelRaspberryDelightCheesecakeOrder = new CancelCheesecakeOrderCommand(raspberryDelightCheesecake);
	
	PlaceCheesecakeOrderCommand placeStrawberryCheesecakeOrder = new PlaceCheesecakeOrderCommand(strawberryCheesecake);
	CancelCheesecakeOrderCommand cancelStrawberryCheesecakeOrder = new CancelCheesecakeOrderCommand(strawberryCheesecake);
	
	PlaceCookieOrderCommand placeFrostedSugarCookieOrder = new PlaceCookieOrderCommand(frostedSugarCookie);
	CancelCookieOrderCommand cancelFrostedSugarCookieOrder = new CancelCookieOrderCommand(frostedSugarCookie);
	
	PlaceCookieOrderCommand placeGooeyChocolateChunkCookieOrder = new PlaceCookieOrderCommand(gooeyChocolateChunkCookie);
	CancelCookieOrderCommand cancelGooeyChocolateChunkCookieOrder = new CancelCookieOrderCommand(gooeyChocolateChunkCookie);
	
	PlaceCookieOrderCommand placeLavenderBlueberryCookieOrder = new PlaceCookieOrderCommand(lavenderBlueberryCookie);
	CancelCookieOrderCommand cancelLavenderBlueberryCookieOrder = new CancelCookieOrderCommand(lavenderBlueberryCookie);
	
	PlaceCookieOrderCommand placeLemonCookieOrder = new PlaceCookieOrderCommand(lemonCookie);
	CancelCookieOrderCommand cancelLemonCookieOrder = new CancelCookieOrderCommand(lemonCookie);
	
	PlaceMacaroonOrderCommand placeLavenderMacaroonOrder = new PlaceMacaroonOrderCommand(lavenderMacaroon);
	CancelMacaroonOrderCommand cancelLavenderMacaroonOrder = new CancelMacaroonOrderCommand(lavenderMacaroon);
	
	PlaceMacaroonOrderCommand placeLemonMacaroonOrder = new PlaceMacaroonOrderCommand(lemonMacaroon);
	CancelMacaroonOrderCommand cancelLemonMacaroonOrder = new CancelMacaroonOrderCommand(lemonMacaroon);
	
	PlaceMacaroonOrderCommand placeOrangeCreamMacaroonOrder = new PlaceMacaroonOrderCommand(orangeCreamMacaroon);
	CancelMacaroonOrderCommand cancelOrangeCreamMacaroonOrder = new CancelMacaroonOrderCommand(orangeCreamMacaroon);
	
	PlaceMacaroonOrderCommand placeRaspberryMacaroonOrder = new PlaceMacaroonOrderCommand(raspberryMacaroon);
	CancelMacaroonOrderCommand cancelRaspberryMacaroonOrder = new CancelMacaroonOrderCommand(raspberryMacaroon);

	PlaceMacaroonOrderCommand placeStrawberryMacaroonOrder = new PlaceMacaroonOrderCommand(strawberryMacaroon);
	CancelMacaroonOrderCommand cancelStrawberryMacaroonOrder = new CancelMacaroonOrderCommand(strawberryMacaroon);
	
	PlaceMacaroonOrderCommand placeVanillaMacaroonOrder = new PlaceMacaroonOrderCommand(vanillaMacaroon);
	CancelMacaroonOrderCommand cancelVanillaMacaroonOrder = new CancelMacaroonOrderCommand(vanillaMacaroon);
	
	PlacePieOrderCommand placeBlackberryPieOrder = new PlacePieOrderCommand(blackberryPie);
	CancelPieOrderCommand cancelBlackberryPieOrder = new CancelPieOrderCommand(blackberryPie);
	
	PlacePieOrderCommand placePecanPieOrder = new PlacePieOrderCommand(pecanPie);
	CancelPieOrderCommand cancelPecanPieOrder = new CancelPieOrderCommand(pecanPie);
	
	PlacePieOrderCommand placePumpkinPieOrder = new PlacePieOrderCommand(pumpkinPie);
	CancelPieOrderCommand cancelPumpkinPieOrder = new CancelPieOrderCommand(pumpkinPie);
	
	PlacePieOrderCommand placeStrawberryRhubarbPieOrder = new PlacePieOrderCommand(strawberryRhubarbPie);
	CancelPieOrderCommand cancelStrawberryRhubarbPieOrder = new CancelPieOrderCommand(strawberryRhubarbPie);
	
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
