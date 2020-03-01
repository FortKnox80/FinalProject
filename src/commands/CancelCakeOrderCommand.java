package commands;
import cakes.*;

public class CancelCakeOrderCommand implements Command {

	Cake cake;
	
	public CancelCakeOrderCommand(Cake cake) {
		this.cake = cake;
	}
	
	public void execute() {
		cake.cancelOrder();
		
	}

	
	public void undo() {
		cake.cakeOrdered();
		
	}

	
}
