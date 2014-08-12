package Ticket;

public class StudentAdvanceTicket extends Ticket{
	private int price;
	
	public StudentAdvanceTicket(int number,int days) {
		super(number,days);
		this.price = (super.getPrice())/2;
	}
	public int getPrice() {
		return price;
	}
	
	
}
