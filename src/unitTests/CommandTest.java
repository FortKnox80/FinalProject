/**
 * 
 */
package unitTests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import dessertShop.POSConsole;
/**
 * @author erin
 *
 */
class CommandTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	public void commandTest() {
		
		POSConsole pos = new POSConsole();
		
		 pos.orderButtonPushed(0);
		 assertEquals("Your Delicate Lemon Cake has been placed", outContent.toString());
		
	}

}
