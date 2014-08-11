package FinacialClass;

public class ShareAsset {
	private String symbol;
	private double totalCost;
	private double currentPrice;
	
	//constructs a new share asset with the given symbol and current price.
	public ShareAsset(String symbol, double currentPrice){
		this.symbol = symbol;
		this.currentPrice = currentPrice;
		totalCost = 0.0;
	}
	
	//Adds cost of the given amount to this asset
	public void addCost(double cost){
		totalCost += cost;
	}
	
	//returns the given price
	public double getCurrentPrice(){
		return currentPrice;
	}
	
	//return this asset's
	public double getTotalCost(){
		return totalCost;
	}
	
	//set the current share price of this asset to the given amount
	public void setCurrentPrice(double currentPrice){
		this.currentPrice = currentPrice;
	}
}
