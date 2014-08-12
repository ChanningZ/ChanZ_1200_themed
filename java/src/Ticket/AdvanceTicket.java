package Ticket;

public class AdvanceTicket extends Ticket{
	private int price;
	
	public AdvanceTicket(int number, int days) {
		super(number,days);
		this.price = super.getPrice();
	}
	
	public int getPrice(){
		return price;
	}
}
