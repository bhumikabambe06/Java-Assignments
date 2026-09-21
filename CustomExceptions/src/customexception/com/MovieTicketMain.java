package customexception.com;

import java.util.Scanner;

class InvalidTicketNumberException extends Exception{
	InvalidTicketNumberException(String message)
	{
		super(message);
	}
}
class TicketsSoldOutException extends Exception
{
	TicketsSoldOutException(String message)
	{
		super(message);
	}
}
class MovieBooking{
	static int ticketPrice=200;
	static int remainingTickets=50;
	static void bookTickets(int noOfTickets) throws InvalidTicketNumberException,
	TicketsSoldOutException
	{
		if(noOfTickets<=0)
		{
			throw new InvalidTicketNumberException("Invalid ticket number");
		}
		if(noOfTickets>remainingTickets)
		{
			throw new TicketsSoldOutException("Tickets are sold");
		}
		remainingTickets=remainingTickets-noOfTickets;
		int amount=noOfTickets*ticketPrice;
		System.out.println("Booking Succesful for 3 idiots");
		System.out.println("Tickets booked"+noOfTickets);
		System.out.println("Total amount:"+amount);
	 }	
}

public class MovieTicketMain {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(MovieBooking.remainingTickets>0)
		{
		System.out.println("Remaining Tickets:"+MovieBooking.remainingTickets);
		System.out.println("Enter number of tickets");
		int noOfTickets=sc.nextInt();	
		try {
			MovieBooking.bookTickets(noOfTickets);
		} catch (InvalidTicketNumberException e) {
			e.printStackTrace();
		} catch (TicketsSoldOutException e) {
			System.out.println(e.getMessage());
		}
		}
		sc.close();
	}
}
