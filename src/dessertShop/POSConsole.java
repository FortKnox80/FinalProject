package dessertShop;


import brownies.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;
import decorations.*;
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
	
	final int blondieB = 0;
	final int fudgeB = 1;
	final int constB = 2;
	final int swirlB = 3;
	
	//Set all the cakes
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
	
	//Set all the cheesecakes
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
	
	//Set all the cookies
	Cookie frostedSugarCookie = new FrostedSugarCookie();
	Cookie gooeyChocolateChunkCookie = new GooeyChocolateChunkCookie();
	Cookie lavenderBlueberryCookie = new LavenderBlueberryCookie();
	Cookie lemonCookie = new LemonCookie();
	
	final int frostedCK = 15;
	final int  chocCK = 16;
	final int lavCK = 17;
	final int lemonCK = 18;
	
	//Set the macaroons
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
	
	
	//Set the pies
	
	Pie blackberryPie = new BlackberryPie();
	Pie pecanPie = new PecanPie();
	Pie pumpkinPie = new PumpkinPie();
	Pie strawberryRhubarbPie = new StrawberryRhubarbPie();
	
	final int blackP = 25;
	final int pecanP = 26;
	final int pumpP = 27;
	final int strawRP = 28;
	
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
	
	public void orderButtonPushed(int slot) {
		 pos.orderButtonPushed(slot);
	}

	
	public void cancelOrderButtonPushed(int slot) {
		pos.cancelOrderButtonPushed(slot);
	}
}
