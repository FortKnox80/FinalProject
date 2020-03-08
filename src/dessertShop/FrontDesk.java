package dessertShop;

import java.util.Scanner;

import brownies.*;
import cakes.*;
import cheesecakes.*;
import cookies.*;
import decorations.*;
import macaroons.*;
import menus.*;
import pies.*;

public class FrontDesk {

	// Place the order on the POS and instantiate a new dessert based on the order
	public static Desserts PlacePOSOrder(String orderSelection, Menu menu) {

		Desserts dessert = new UnknownCake();
		POSConsole pos = new POSConsole();
		Scanner userInput = new Scanner(System.in);
		WeddingShop weddingShop = new WeddingShop();

		while (true) {
			// Inputs are taken in and processed based on the menu that was selected

			if (menu.toString().equalsIgnoreCase(weddingShop.brownieMenu.toString())) {
				if (orderSelection.toLowerCase().contains("blondie")) {
					pos.orderButtonPushed(pos.blondieB);
					dessert = new BlondieBrownie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("fudge")) {
					pos.orderButtonPushed(pos.fudgeB);
					dessert = new ChocolateFudgeBrownie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("constellation")) {
					pos.orderButtonPushed(pos.constB);
					dessert = new ConstellationBrownie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("white chocolate")) {
					pos.orderButtonPushed(pos.swirlB);
					dessert = new WhiteChocolateSwirlBrownie();
					return dessert;
				} else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}
			} else if (menu.toString().equalsIgnoreCase(weddingShop.cakeMenu.toString())) {
				if (orderSelection.toLowerCase().contains("flourless") || orderSelection.toLowerCase().contains("chocolate")) {
					pos.orderButtonPushed(pos.chocC);
					dessert = new FlourlessChocolateCake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("galaxy")) {
					pos.orderButtonPushed(pos.galaxyC);
					dessert = new GalaxyCake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("lemon")) {
					pos.orderButtonPushed(pos.lemonC);
					dessert = new LemonCake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("champagne")) {
					pos.orderButtonPushed(pos.champC);
					dessert = new PinkChampagneCake();
					return dessert;

				} else if (orderSelection.toLowerCase().contains("rainbow")) {
					pos.orderButtonPushed(pos.rainC);
					dessert = new RainbowCake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("rose")) {
					pos.orderButtonPushed(pos.roseC);
					dessert = new RoseCake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("vanilla")) {
					pos.orderButtonPushed(pos.vanC);
					dessert = new VanillaBeanCake();
					return dessert;
				} else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}
			}

			else if (menu.toString().equalsIgnoreCase(weddingShop.cheesecakeMenu.toString())) {
				if (orderSelection.toLowerCase().contains("blackberry")) {
					pos.orderButtonPushed(pos.blackCC);
					dessert = new BlackberryCheesecake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("blueberry")) {
					pos.orderButtonPushed(pos.blueCC);
					dessert = new BlueberryCheesecake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("chocolate")) {
					pos.orderButtonPushed(pos.chocCC);
					dessert = new DecadentChocolateCheesecake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("raspberry")) {
					pos.orderButtonPushed(pos.raspCC);
					dessert = new RaspberryDelightCheesecake();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("strawberry")) {
					pos.orderButtonPushed(pos.strawCC);
					dessert = new StrawberryCheesecake();
					return dessert;
				} else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}
			} else if (menu.toString().equalsIgnoreCase(weddingShop.cookieMenu.toString())) {
				if (orderSelection.toLowerCase().contains("frosted")) {
					pos.orderButtonPushed(pos.frostedCK);
					dessert = new FrostedSugarCookie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("gooey") || orderSelection.toLowerCase().contains("chocolate") ) {
					pos.orderButtonPushed(pos.chocCK);
					dessert = new GooeyChocolateChunkCookie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("lavender")) {
					pos.orderButtonPushed(pos.lavCK);
					dessert = new LavenderBlueberryCookie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("lemon")) {
					pos.orderButtonPushed(pos.lemonCK);
					dessert = new LemonCookie();
					return dessert;
				} else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}
			} else if (menu.toString().equalsIgnoreCase(weddingShop.macaroonMenu.toString())) {
				if (orderSelection.toLowerCase().contains("lavender")) {
					pos.orderButtonPushed(pos.lavM);
					dessert = new LavenderMacaroon();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("lemon")) {
					pos.orderButtonPushed(pos.lemonM);
					dessert = new LemonMacaroon();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("orange")) {
					pos.orderButtonPushed(pos.orangeM);
					dessert = new OrangeCreamMacaroon();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("raspberry")) {
					pos.orderButtonPushed(pos.raspM);
					dessert = new RaspberryMacaroon();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("strawberry")) {
					pos.orderButtonPushed(pos.strawM);
					dessert = new StrawberryMacaroon();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("vanilla")) {
					pos.orderButtonPushed(pos.vanM);
					dessert = new VanillaMacaroon();
					return dessert;
				} else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}
			} else if (menu.toString().equalsIgnoreCase(weddingShop.pieMenu.toString())) {
				if (orderSelection.toLowerCase().contains("blackberry")) {
					pos.orderButtonPushed(pos.blackP);
					dessert = new BlackberryPie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("pecan")) {
					pos.orderButtonPushed(pos.pecanP);
					dessert = new PecanPie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("pumpkin")) {
					pos.orderButtonPushed(pos.pumpP);
					dessert = new PumpkinPie();
					return dessert;
				} else if (orderSelection.toLowerCase().contains("strawberry")) {
					pos.orderButtonPushed(pos.strawRP);
					dessert = new StrawberryRhubarbPie();
					return dessert;
				}

				else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}
			} else if (menu.toString().equalsIgnoreCase("Gluten Free Menu")) {
				if (orderSelection.toLowerCase().contains("chocolate cheesecake")) {
					pos.orderButtonPushed(pos.chocCC);
					dessert = new DecadentChocolateCheesecake();
					return dessert;

				} else if (orderSelection.toLowerCase().contains("chocolate cake")) {
					pos.orderButtonPushed(pos.chocC);
					dessert = new FlourlessChocolateCake();
					return dessert;
				} else {
					System.out.println("I'm sorry we don't carry that. Would you like something else?");
					orderSelection = userInput.nextLine();
				}

			}
		}
	}

	// Determine which menu to print out based aon the dessert type selected
	public static Menu GetMenu(String menuSelection) {
		WeddingShop weddingShop = new WeddingShop();
		Scanner userInput = new Scanner(System.in);

		while (true) {
			if (menuSelection.toLowerCase().contains("brownie")) {
				System.out.println("Wonderful! Take a look at the brownies that we offer");
				weddingShop.brownieMenu();
				return weddingShop.brownieMenu;
			} else if (menuSelection.toLowerCase().contains("cake")) {
				System.out.println("Wonderful! Take a look at the cakes that we offer");
				weddingShop.cakeMenu();
				return weddingShop.cakeMenu;
			} else if (menuSelection.toLowerCase().contains("cheese")) {
				System.out.println("Wonderful! Take a look at the cheesecakes that we offer");
				weddingShop.cheesecakeMenu();
				return weddingShop.cheesecakeMenu;
			} else if (menuSelection.toLowerCase().contains("cookie")) {
				System.out.println("Wonderful! Take a look at the cookies that we offer");
				weddingShop.cookieMenu();
				return weddingShop.cookieMenu;
			} else if (menuSelection.toLowerCase().contains("macaroon")) {
				System.out.println("Wonderful! Take a look at the macaroons that we offer");
				weddingShop.macaroonMenu();
				return weddingShop.macaroonMenu;
			} else if (menuSelection.toLowerCase().contains("pie")) {
				System.out.println("Wonderful! Take a look at the pies that we offer");
				weddingShop.pieMenu();
				return weddingShop.pieMenu;
			} else if (menuSelection.toLowerCase().contains("gluten")) {
				System.out
						.println("Wonderful! We have some delicious desserts that can accommodate a gluten free diet");
				weddingShop.glutenFreeMenu();
				return weddingShop.glutenFreeMenu;
			} else {
				System.out.println("I'm sorry I didn't catch that. What kind would you like?");
				menuSelection = userInput.nextLine();
			}
		}

	}

	// Decorate the decided upon dessert based on user selection
	public static Desserts OrderDecorations(Desserts dessert, String decoration) {

		WeddingShop weddingShop = new WeddingShop();
		weddingShop.decorationsMenu();

		if (decoration.toLowerCase().contains("pearls")) {
			dessert = new EdiblePearls(dessert);
		}
		if (decoration.toLowerCase().contains("fresh")) {
			dessert = new FreshFlowers(dessert);
		}
		if (decoration.toLowerCase().contains("gold")) {
			dessert = new GoldLeaf(dessert);
		}
		if (decoration.toLowerCase().contains("paint")) {
			dessert = new HandPaint(dessert);
		}
		if (decoration.toLowerCase().contains("piped")) {
			dessert = new PipedFlowers(dessert);
		}
		if (decoration.toLowerCase().contains("writing") || (decoration.toLowerCase().contains("message"))) {
			dessert = new Writing(dessert);
		}
		return dessert;

	}

	public static void main(String[] args) {
		WeddingShop weddingShop = new WeddingShop();

		// Print out a welcome
		System.out.println(
				"Welcome to Fiona's Fabulous Desserts! We want to bring a unique and beautiful flair to your wedding. \n"
						+ "We for one are tired of the typical three tier cake being the only option, so we have come up with several\n"
						+ "different takes for a beautiful and unique flare for your elegant or fun wedding.\n"
						+ "To start off with, we offer a variety of selections. We have:\nBrownies \nCakes \nCheesecakes \nCookies \nMacaroons \nPies \nGluten Free Desserts \n\nWhich of these options would you like to look into?");

		Scanner userInput = new Scanner(System.in);

		String menuSelection = userInput.nextLine();

		// Determine which menu to show based on dessert type desired
		Menu menu = GetMenu(menuSelection);

		System.out.println("Which of these delectable items would you like to place an order for?");

		String selection = userInput.nextLine();

		// Place an order for the dessert they want
		Desserts dessert = PlacePOSOrder(selection, menu);

		System.out.println("What type of decorations would you like?");

		// Show the types of decorations we have
		weddingShop.decorationsMenu();

		String decorationRequest = userInput.nextLine();

		while (true) {
			// If they are done picking decorations confirm the order, get the guest count,
			// and show the price
			if (decorationRequest.toLowerCase().contains("no") || decorationRequest.toLowerCase().contains("none")
					|| decorationRequest.toLowerCase().contains("don't")) {

				System.out.println("That sounds so beautiful! We cannot wait to bring your " + dessert.getFlavor()
						+ " to your wedding for you. \nIt is going to be beautiful. ");
				System.out.println("How many guests are you expecting?");
				double guestCount = userInput.nextInt();
				double cost = guestCount * dessert.cost() / 10;
				String formattedCost = String.format("%.02f", cost);
				System.out.printf("The cost will be: " + cost + " So that we can make enoough for all of your guests. "
						+ "\nWe will be in contact with you 2 months before to check on the numbers. I hope you have a great day!");
				userInput.close();
				break;
			}

			// Give the option for multiple decorations
			dessert = OrderDecorations(dessert, decorationRequest);
			System.out.println("Would you like any other decorations?");
			decorationRequest = userInput.nextLine();
		}
	}

}
