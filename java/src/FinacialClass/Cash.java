package FinacialClass;

public class Cash implements Asset {

	private double amount; //amount of money held
	
	//constructs a cash investment of the given amount
	public Cash(double amount){
		this.amount=amount;
	}

	//return the value of cash
	public double getMarketValue() {
		return amount;
	}

	//no profit on cash
	public double getProfit() {
		return 0.00;
	}
	
	//sets the amount of given cash
	public  void setAmount(double amount){
		this.amount = amount;
	}
	

}
