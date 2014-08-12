package Ticket;

public abstract class Ticket {
	private int number;
	private int price;
	
	public Ticket(int number, int days){
		this.number = number;
		if(days >= 10){
			price = 30;
		}else if(days == 1){
			price = 50; 
		}else{
			price = 40;
		}
	}

	
	
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void printString(){
		System.out.println("Number: "+number+", "+"Price: "+getPrice());
	}


}
