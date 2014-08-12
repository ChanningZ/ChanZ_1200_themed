package Ticket;

public class Test {
	public static void main(String[] Args){
		AdvanceTicket AT = new AdvanceTicket(1,2);
		StudentAdvanceTicket SAT = new StudentAdvanceTicket(2,3);
		WalkupTicket WT = new WalkupTicket(3,1);
		
		AT.printString();
		SAT.printString();
		WT.printString();
		
	}
}
