package Ticket;

public class WalkupTicket extends Ticket{
	private int price;
	
	public WalkupTicket(int number, int days) {
		super(number, days);
		this.price = super.getPrice();
	}
	public int getPrice(){
		return price;
	}
	
	
}
