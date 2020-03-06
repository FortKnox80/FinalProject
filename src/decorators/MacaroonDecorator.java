package decorators;

import macaroons.*;

public abstract class MacaroonDecorator extends Macaroon {
	
	public abstract String getMacaroonFlavor();

}
