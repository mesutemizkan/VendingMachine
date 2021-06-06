package projectvendingmachine;

public class MyClass {

	public static void main(String[] args) {
		
		Products p = new Products();
		
		Methods m = new Methods();
		
		double accountBalance=0;
		accountBalance=m.getMoney(accountBalance);
		p.setPrice(m.select(p));
		m.balance(p.getPrice(), accountBalance, p);
		m.purchase(p.getPrice(), accountBalance, p);
	}

}
