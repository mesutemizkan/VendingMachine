package projectvendingmachine;

import java.util.Scanner;

public class Methods {

	Scanner scan = new Scanner(System.in);
	public double select(Products product) {
		System.out.println(product.toString());
		do {
			
		System.out.println("Please enter a product number from 1 to 10");
		product.setPruductNum(scan.nextInt());
		
		if(product.getPruductNum()<1 || product.getPruductNum()>10) {
			System.out.println("Please enter a valid product number");
		}
		
		}while(product.getPruductNum()<1 || product.getPruductNum()>10);
		
		switch(product.getPruductNum()) {
		case 1:
			product.setPrice(product.getSnicker());
			break;
		case 2:
			product.setPrice(product.getChipsAhoy());
			break;
		case 3:
			product.setPrice(product.getPringles());
			break;
		case 4:
			product.setPrice(product.getMilano());
			break;
		case 5:
			product.setPrice(product.getReeses());
			break;
		case 6:
			product.setPrice(product.getCocaCola());
			break;
		case 7:
			product.setPrice(product.getFanta());
			break;
		case 8:
			product.setPrice(product.getWater());
			break;
		case 9:
			product.setPrice(product.getArizona());
			break;
		case 10:
			product.setPrice(product.getSkittles());
			break;
		}	
		return product.getPrice();
		
	}
	
	public double balance(double price, double accountBalance, Products product) {
		
		while(accountBalance < price ) {
			System.out.println("You do not have enough money to buy product,would yo like to add some money (y/n) ");
	        char confirm = scan.next().toLowerCase().charAt(0);
	        
	        if(confirm == 'y') {
	        	System.out.println("How much do you want to add?");
	        	double deposit = scan.nextDouble();
	        	accountBalance = accountBalance + deposit;
	        	System.out.println("Your current account: "+accountBalance);
	        	price = select(product);
	        }else {
	        	System.out.println("Your current account: "+accountBalance);
	        	System.out.println("Thanks for shopping....");
	        	break;
	        }
		}
		return accountBalance;
		
	}
	
	public void purchase(double price, double accountBalance, Products product) {
		while(accountBalance >= product.getPrice()) {
			accountBalance = accountBalance - product.getPrice();
			System.out.println("Your current account: "+accountBalance);
			System.out.println("Would you like to buy another product? (y/n)");
			 char confirm = scan.next().toLowerCase().charAt(0);
			 if(confirm == 'y') {
				 product.setPrice(select(product));
				 accountBalance = balance(product.getPrice(), accountBalance, product);
			 }else {
				 System.out.println("Thanks for shopping");
				 break;
			 }
		 
		}
	}
	
	public double getMoney(double money) {
		System.out.println("How much do you want to deposit?");
		double deposit = scan.nextDouble();
		money = money + deposit;
		System.out.println("Your current account: "+money);
		return money;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
