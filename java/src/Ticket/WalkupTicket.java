package Ticket;

public class WalkupTicket extends Ticket{
	private double price;
	
	public WalkupTicket(int number) {
		super(number);
		setWUPrice(50.0);
	}
	public double getPrice(){
		return super.getPrice();
	}
	public double getWUPrice() {
		return price;
	}
	public void setWUPrice(double price) {
		this.price = price;
	}
}
