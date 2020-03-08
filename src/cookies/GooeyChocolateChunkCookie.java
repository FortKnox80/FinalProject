package cookies;

//A class for chocolate chunk cookies
public class GooeyChocolateChunkCookie extends Cookie {

	public GooeyChocolateChunkCookie() {
		ordered = false;
		name = "Gooey Chocolate Chunk Cookie";
		tastyBits = "Milk Chocolate Chunks";
		cookieBase = "Soft Vanilla Cookie";
		toppings = "";
	}

	//Set the cookie cost
	public double cost() {
		
		return 100.00;
	}
	
	//Place the cookie order
	public boolean cookieOrdered() {
		ordered = true;
		System.out.println("Your " +name+ " order has been placed");
		return ordered;
	}
	
	//Cancel the cookie order
	public boolean orderCanceled() {
		ordered = false;
		System.out.println("Ok your " + name + " order has been canceled.");
		return ordered;
	}
	
}
