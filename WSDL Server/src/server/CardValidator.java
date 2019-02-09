package server;

import javax.jws.WebService;

@WebService
public class CardValidator{
	
	public CardValidator() {
		
	}
	
	public boolean validate(CreditCard creditCard){
		if(creditCard.getNumber().length() % 2 != 0)
			return true;
		return false;
	}
}