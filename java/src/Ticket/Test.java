package Ticket;

public class Test {
	public static void main(String[] Args){
		AdvanceTicket AT = new AdvanceTicket(1,10);
		StudentAdvanceTicket SAT = new StudentAdvanceTicket(10,20);
		WalkupTicket WT = new WalkupTicket(2);
		
		System.out.println(AT.getPrice());
		System.out.println(SAT.getPrice());
		System.out.println(WT.getPrice());
	}
}
