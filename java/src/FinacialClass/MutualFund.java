package FinacialClass;

public class MutualFund extends ShareAsset implements Asset {
	private double totalShares;
	public MutualFund(String symbol, double currentPrice) {
		super(symbol, currentPrice);
		totalShares = 0.0;
	}
	
	public double getMarketValue() {
		return totalShares * getCurrentPrice();
	}
	
	public double getProfit() {
		return getMarketValue() - getTotalCost();
	}
	
	public double getTotalShares(){
		return totalShares;
	}
	
	public void purchase(double shares, double pricePerShare) {
		totalShares += shares;
		addCost(shares * pricePerShare);
	}
	
}
