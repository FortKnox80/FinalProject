package dessertShop;

public class WeddingShop {
	
	Cake bakeACake(String type) {
		 Cake cake = new UnknownCake();
		 
		 if(type.toLowerCase().contains("lemon")) {
			 cake = new LemonCake();
		 }
		 return cake;
	}

}
