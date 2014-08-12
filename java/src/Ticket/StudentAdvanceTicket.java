package Ticket;

public class StudentAdvanceTicket extends Ticket{
	private double price;
	private int days;
	public StudentAdvanceTicket(int number,int days) {
		super(number);
		if(days >= 10){
			price = 15;
		}else if(days > 1&&days < 10){
			price = 20; 
		}else{
			price = 25;
		}
	}
	public double getPrices() {
		return price;
	}
}
