package Ticket;

public abstract class Ticket {
	private int number;
	private double price;
	
	public Ticket(int number){
		this.number = number;
		price = 0.0;
	}


	
	
	public double getPrice(){
		return price;
	}
	
	public void printString(){
		System.out.println("Number: "+number+", "+"Price: "+getPrice());
	}


}
