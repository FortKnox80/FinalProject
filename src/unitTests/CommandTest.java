package unitTests;

import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.hamcrest.CoreMatchers;

import dessertShop.POSConsole;

class CommandTest {
	
	@org.junit.jupiter.api.Test
	public void blondieTest() {
		 final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 System.setOut(new PrintStream(outContent));
		 POSConsole pos = new POSConsole();
		 
		 pos.orderButtonPushed(0);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Blondes Have More Fun"));
		 
		 pos.orderButtonPushed(6);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Delicate Lemon Cake"));
		 
		 pos.orderButtonPushed(11);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Fresh Picked Blackberry Cheesecake"));
		 
		 pos.orderButtonPushed(29);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Decadent Chocolate Cheesecake"));
		 
		 pos.orderButtonPushed(20);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Zesty Lemon Macaroon"));

		 pos.orderButtonPushed(9);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Stop and Smell the Roses Cake"));
		 
		 pos.orderButtonPushed(26);
		 assertThat(outContent.toString(), CoreMatchers.containsString("Your Grandma's Pecan Pie"));
	 
	}
	

}
