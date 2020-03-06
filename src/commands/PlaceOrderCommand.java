package commands;

import brownies.Brownie;
import cakes.*;
import cheesecakes.Cheesecake;
import cookies.Cookie;
import dessertShop.Desserts;
import macaroons.Macaroon;
import pies.Pie;

public class PlaceOrderCommand implements Command {

	Cake cake;
	Pie pie;
	Cheesecake cheesecake;
	Cookie cookie;
	Brownie brownie;
	Macaroon macaroon;
	
	public PlaceOrderCommand(Desserts dessertType) {
		if(dessertType.toString().toLowerCase().contains("cake")) {
			this.cake = (Cake) dessertType;
		}
		if(dessertType.toString().toLowerCase().contains("cheesecake")) {
			this.cheesecake = (Cheesecake) dessertType;
		}
		if(dessertType.toString().toLowerCase().contains("pie")) {
			this.pie = (Pie) dessertType;
		}
		if(dessertType.toString().toLowerCase().contains("cookie")) {
			this.cookie = (Cookie) dessertType;
		}
		if(dessertType.toString().toLowerCase().contains("brownie")) {
			this.brownie = (Brownie) dessertType;
		}
		if(dessertType.toString().toLowerCase().contains("macaroon")) {
			this.macaroon = (Macaroon) dessertType;
		}
	}
	
	public void execute() {
		cake.cakeOrdered();
		
	}

	
	public void undo() {
		cake.cancelOrder();
	}

	
}
