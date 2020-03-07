package dessertShop;

import java.util.Scanner;

import cakeDecoarations.*;
import cakes.*;
import cakes.LemonCake;

public class FrontDesk {
	
	public static void PlacePOSOrder(String orderSelection) {
		POSConsole pos = new POSConsole();
		while (true) {
			if(orderSelection.toLowerCase().contains("blondie")) {
				pos.orderButtonPushed(0);
			}
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
	}

}
