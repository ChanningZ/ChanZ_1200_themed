package Ticket;

public class AdvanceTicket extends Ticket{
	private static double price;
	
	
	public AdvanceTicket(int number, int days) {
		super(number);
		if(days >= 10){
			price = 30;
		}else if(days > 1&&days < 10){
			price = 40; 
		}else{
			price = 50;
		}
	}
	
	public static double getAdvanceTicketPrice(){
		return price;
	}
}
