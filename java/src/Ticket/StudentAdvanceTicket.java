package Ticket;

public class StudentAdvanceTicket extends Ticket{
	private double prices;
	public StudentAdvanceTicket(int number) {
		super(number);
		setSAPrices(AdvanceTicket.getAdvanceTicketPrice()/2);
	}
	public double getSAPrices() {
		return prices;
	}
	public void setSAPrices(double prices) {
		this.prices = prices;
	}

}
