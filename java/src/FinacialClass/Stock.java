package FinacialClass;

public class Stock extends ShareAsset implements Asset {
	private int totalShares;
	
	public Stock(String symbol, double currentPrice) {
		super(symbol, currentPrice);
		totalShares=0;
	}

	
	public double getMarketValue() {
		return getCurrentPrice() *totalShares ;
	}
	
	//return the total number of shares purchased
	public int getTotalShares(){
		return totalShares;
	}
	
	public double getProfit() {
		return getMarketValue() - getTotalCost();
	}
	
	public void purchase(int shares, double pricePerShare) {
		totalShares += shares;
		addCost(shares * pricePerShare);
	}
}
