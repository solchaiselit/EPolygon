package projectCore;

public class Ticket extends Session{

	private int Price;
	private int SeatNumber;
	
	public Ticket(int price, int seatNumber) {
		super();
		Price = price;
		SeatNumber = seatNumber;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(Movie movie, Time startTime) {
		super(movie, startTime);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	
	
}
