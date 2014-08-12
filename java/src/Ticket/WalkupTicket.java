package Ticket;

public class WalkupTicket extends Ticket{
	private double price;
	
	public WalkupTicket(int number) {
		super(number);
		price=50.0;
	}
	public double getPrice(){
		return price;
	}
	
	
}
