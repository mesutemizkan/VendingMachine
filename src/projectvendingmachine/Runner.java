package projectvendingmachine;

public class Runner {

	/*
	 *    Positive Scenario:
	       User should be able to buy a single product
	      User should be able to buy multiple products
	       Negative Scenario:
	       User should be able to buy if the balance is not enough (add/no add)
	 
	 */
	public static void main(String[] args) {
		
		Products product = new Products();
		Methods method = new Methods();
		
		System.out.println("Hi, Welcome to our shop...");
		
		double accountBalance = 0;
		accountBalance = method.getMoney(accountBalance);
		product.setPrice(method.select(product));
		accountBalance = method.balance(product.getPrice(), accountBalance , product);
		method.purchase(product.getPrice(), accountBalance, product);

	}

}
