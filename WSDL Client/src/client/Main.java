package client;

public class Main {

	public static void main(String[] args){
		try {
			CardValidatorService cardServ = new CardValidatorServiceLocator();
			CardValidator card = cardServ.getCardValidatorPort();
			System.out.println(card.validate(new CreditCard(123,"123","1234567891234560","visa")));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
