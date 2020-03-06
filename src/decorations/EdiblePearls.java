package decorations;

import cakes.*;
import cookies.*;
import cheesecakes.*;
import brownies.*;
import macaroons.*;
import pies.*;
import decorators.Decorator;
import dessertShop.Desserts;

public class EdiblePearls extends Decorator {

	Cake cake;
	Pie pie;
	Cheesecake cheesecake;
	Cookie cookie;
	Brownie brownie;
	Macaroon macaroon;
	
	EdiblePearls(Desserts dessertType) {
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

	public String getFlavor() {
		return cake.getFlavor() + "add a classic look with some edible pearls,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}
