package dessertShop;

import java.util.Scanner;

import brownies.*;
import cakeDecoarations.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;

public class FrontDesk {
	
	public static Desserts PlacePOSOrder(String orderSelection) {
		Desserts dessert = new UnknownCake();
		POSConsole pos = new POSConsole();
		while (true) {
			if(orderSelection.toLowerCase().contains("blondie")) {
				pos.orderButtonPushed(pos.blondieB);
				dessert = new BlondieBrownie();
			}
			if(orderSelection.toLowerCase().contains("fudge") && orderSelection.toLowerCase().contains("brownie")) {
				pos.orderButtonPushed(pos.fudgeB);
				dessert = new ChocolateFudgeBrownie();
			}
			if(orderSelection.toLowerCase().contains("constellation")) {
				pos.orderButtonPushed(pos.constB);
				dessert = new ConstellationBrownie();
			}
			if(orderSelection.toLowerCase().contains("white chocolate")) {
				pos.orderButtonPushed(pos.swirlB);
				dessert = new WhiteChocolateSwirlBrownie();
			}
			if(orderSelection.toLowerCase().contains("flourless")) {
				pos.orderButtonPushed(pos.chocC);
				dessert = new FlourlessChocolateCake();
			}
			if(orderSelection.toLowerCase().contains("galaxy")) {
				pos.orderButtonPushed(pos.galaxyC);
				dessert = new GalaxyCake();
			}
			if(orderSelection.toLowerCase().contains("lemon") && orderSelection.toLowerCase().contains("cake")) {
				pos.orderButtonPushed(pos.lemonC);
				dessert = new LemonCake();
			}
			if(orderSelection.toLowerCase().contains("champagne")) {
				pos.orderButtonPushed(pos.champC);
				dessert = new PinkChampagneCake();
				
			}
			if(orderSelection.toLowerCase().contains("rainbow")) {
				pos.orderButtonPushed(pos.rainC);
				dessert = new RainbowCake();
			}
			if(orderSelection.toLowerCase().contains("rose")) {
				pos.orderButtonPushed(pos.roseC);
				dessert = new RoseCake();
			}
			if(orderSelection.toLowerCase().contains("vanilla") && orderSelection.toLowerCase().contains("cake")) {
				pos.orderButtonPushed(pos.vanC);
				dessert = new VanillaBeanCake();
			}
			if(orderSelection.toLowerCase().contains("blackberry") && orderSelection.toLowerCase().contains("cheesecake")) {
				pos.orderButtonPushed(pos.blackCC);
				dessert = new BlackberryCheesecake();
			}
			if(orderSelection.toLowerCase().contains("blueberry") && orderSelection.toLowerCase().contains("cheesecake")) {
				pos.orderButtonPushed(pos.blueCC);
				dessert = new BlueberryCheesecake();
			}
			if(orderSelection.toLowerCase().contains("chocolate") && orderSelection.toLowerCase().contains("cheesecake")) {
				pos.orderButtonPushed(pos.chocCC);
				dessert = new DecadentChocolateCheesecake();
			}
			if(orderSelection.toLowerCase().contains("raspberry") && orderSelection.toLowerCase().contains("cheesecake")) {
				pos.orderButtonPushed(pos.raspCC);
				dessert = new RaspberryDelightCheesecake();
			}
			if(orderSelection.toLowerCase().contains("strawberry") && orderSelection.toLowerCase().contains("cheesecake")) {
				pos.orderButtonPushed(pos.strawCC);
				dessert = new StrawberryCheesecake();
			}
			if(orderSelection.toLowerCase().contains("frosted")) {
				pos.orderButtonPushed(pos.frostedCK);
				dessert = new FrostedSugarCookie();
				
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			if(orderSelection.toLowerCase().contains("")) {
				pos.orderButtonPushed(pos);
			}
			
			return dessert;
		}
	}
	
	public static void GetMenu(String menuSelection) {
		WeddingShop weddingShop = new WeddingShop();
		while (true) {
			if(menuSelection.toLowerCase().contains("brownie")) {
				System.out.println("Wonderful! Take a look at the brownies that we offer");
				weddingShop.brownieMenu();
				break;
			}
			else if(menuSelection.toLowerCase().contains("cake")) {
				System.out.println("Wonderful! Take a look at the cakes that we offer");
				weddingShop.cakeMenu();
				break;
			}
			else if(menuSelection.toLowerCase().contains("brownie")) {
				System.out.println("Wonderful! Take a look at the brownies that we offer");
				weddingShop.brownieMenu();
				break;
			}
			else if(menuSelection.toLowerCase().contains("cheese")) {
				System.out.println("Wonderful! Take a look at the cheesecakes that we offer");
				weddingShop.cheesecakeMenu();
				break;
			}
			else if(menuSelection.toLowerCase().contains("cookie")) {
				System.out.println("Wonderful! Take a look at the cookies that we offer");
				weddingShop.cookieMenu();
				break;
			}
			else if(menuSelection.toLowerCase().contains("macaroon")) {
				System.out.println("Wonderful! Take a look at the macaroons that we offer");
				weddingShop.macaroonMenu();
				break;
			}
			else if(menuSelection.toLowerCase().contains("pie")) {
				System.out.println("Wonderful! Take a look at the pies that we offer");
				weddingShop.pieMenu();
				break;
			}
			else {
				System.out.println("I'm sorry I didn't catch that. What kind would you like?");
			}
		}
		
	}

	public static void main(String[] args) {
		WeddingShop weddingShop = new WeddingShop();
		
		System.out.println("Welcome to Fiona's Fabulous Desserts! We want to bring a unique and beautiful flair to your wedding. \n"
				+ "We for one are tired of the typical three tier cake being the only option, so we have come up with several\n"
				+ "different takes for a beautiful and unique flare for your elegant or fun wedding.\n"
				+ "To start off with, we offer a variety of selections. We have:\nBrownies \nCakes \nCheesecakes \nCookies \nMacaroons, and \nPies \n\nWhich of these options would you like to look into?");
		
		Scanner userInput = new Scanner(System.in);
		
		String menuSelection = userInput.nextLine();
		
		
		GetMenu(menuSelection);
		
		System.out.println("Which of these delectable items would you like to place an order for?");
		String selection = userInput.nextLine();
		Desserts dessert = PlacePOSOrder(selection);
		System.out.println(dessert.getName() + dessert.cost());
	}

}
