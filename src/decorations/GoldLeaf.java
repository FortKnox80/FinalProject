package decorations;

import brownies.Brownie;
import cakes.*;
import cheesecakes.Cheesecake;
import cookies.Cookie;
import decorators.Decorator;
import dessertShop.Desserts;
import macaroons.Macaroon;
import pies.Pie;

public class GoldLeaf extends Decorator {

	Cake cake;
	Pie pie;
	Cheesecake cheesecake;
	Cookie cookie;
	Brownie brownie;
	Macaroon macaroon;

	GoldLeaf(Desserts dessertType) {
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
		return cake.getFlavor() + "let's top it with some beautiful gold leaf,";
	}

	public double cost() {
		
		return cake.cost() + 19.99;
	}

}