package unitTests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cakes.*;
import decorations.*;
import dessertShop.Desserts;

class DecoratorTest {

	@Test
	void testDecorator() {
		Desserts cake = new LemonCake();
		cake = new EdiblePearls(cake);
		String decorated = cake.getFlavor();
		assertEquals(decorated, "A Delicate Lemon Cake null Lemon Curd Vanilla Buttercream Cake: add a classic look with some edible pearls,");
	}

}
