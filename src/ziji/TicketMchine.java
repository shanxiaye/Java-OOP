package ziji;

import java.util.Scanner;

public class TicketMchine {
	private int price=100;
	private int balance;
	private int toatl;
	
	
	public void showPrompt(){
		System.out.println("Welcome to buy ticket.");
		System.out.println("The price is:"+price);
	}
	public void insertMoney(int bill) {
		balance+=bill;
		printBalance();
	}
	public void printTicket() {
		if(balance>=price){
			System.out.println("THE TICKET");
			if (balance>price){
				System.out.println("change is"+(balance-price));
			}
			balance-=price;
		}
	}
	public void printBalance(){
		System.out.println("Blance is:"+balance);
	}
	public boolean isEnough(){
		return balance >= price;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TicketMchine tm = new TicketMchine();
		tm.showPrompt();
		int bill;
		do {
			bill = new Scanner(System.in).nextInt();
			tm.insertMoney(bill);
			if (tm.isEnough()){
				tm.printTicket();
				break;
			}
		}while (true);
//		tm.insertMoney(80);
//		tm.insertMoney(30);
//		tm.printTicket();
//		TicketMchine tm2 = new TicketMchine();
//		tm2.price=80;
//		tm2.showPrompt();
//		tm.showPrompt();
	}

}
