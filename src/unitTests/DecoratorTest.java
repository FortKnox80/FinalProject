package unitTests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cakes.*;
import decorations.*;
import dessertShop.Desserts;
import pies.BlackberryPie;

class DecoratorTest {

	@Test
	void testDecorator() {
		
		Desserts pearlCake = new LemonCake();
		pearlCake = new EdiblePearls(pearlCake);
		String decorated = pearlCake.getFlavor();
		assertEquals(decorated, "Delicate Lemon Cake: A Cake With a Lemon Zest Sponge Base and Lemon Curd and "
				+ "Vanilla Buttercream Layers. All Topped With Bright White Vanilla Buttercream Soft Yellow Fondant, Made to Look Classic With Some Edible Pearls");
		
		Desserts goldCake = new LemonCake();
		goldCake = new GoldLeaf(goldCake);
		String gold = goldCake.getFlavor();
		assertEquals(gold, "Delicate Lemon Cake: A Cake With a Lemon Zest Sponge Base and Lemon Curd and Vanilla Buttercream Layers."
				+ " All Topped With Bright White Vanilla Buttercream Soft Yellow Fondant, Topped With Some Beautiful Gold Leaf");
		
		Desserts flowerPie = new BlackberryPie();
		flowerPie = new FreshFlowers(flowerPie);
		String flower = flowerPie.getFlavor();
		assertEquals(flower, "Handpicked Blackberry Pie: Made With a Flakey, Buttery Crust Topped With Blackbird Art Work and Filled With Fresh, Handpicked Blackerries , "
				+ "Topped With Some Fresh Flowers to Create a Finished Look");
	}
	
	

}
