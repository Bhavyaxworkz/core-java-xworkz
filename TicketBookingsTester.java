class TicketBookingsTester{

public static void main(String cos[]){
TicketBookings ticketBookings = new TicketBookings();
 ticketBookings.setBookingId(1);
 ticketBookings.setNoOfSeats(35);
 ticketBookings.setSource("Bangalore");
 ticketBookings.setDestination("Tirupthi");
 ticketBookings.setDate("5-7-2024");
 ticketBookings.setPnr(8625465865L);
 ticketBookings.setPrice(1500.00);
 ticketBookings.setClassType("Sleeper");
 ticketBookings.setBookingType("Senior Citizen");
 ticketBookings.setTransportName("Rajdhani Express");
 
 System.out.println(ticketBookings.getBookingId()+ " " + ticketBookings.getNoOfSeats()+ " " + ticketBookings.getSource()
  + " " + ticketBookings.getDestination()+ " " + ticketBookings.getDate()+ " " + ticketBookings.getPnr()+ " " + 
  ticketBookings.getPrice()+ " " + ticketBookings.getClassType()+ " " + ticketBookings.getBookingType()+ " " + ticketBookings.getTransportName());

  TicketBookings ticketBookings1 = new TicketBookings();
 ticketBookings1.setBookingId(2);
 ticketBookings1.setNoOfSeats(45);
 ticketBookings1.setSource("Delhi");
 ticketBookings1.setDestination("Hyderabad");
 ticketBookings1.setDate("8-7-2023");
 ticketBookings1.setPnr(9545465865L);
 ticketBookings1.setPrice(2800.00);
 ticketBookings1.setClassType("First");
 ticketBookings1.setBookingType("Physical Handicapped");
 ticketBookings1.setTransportName("Duronto Express");
 
 System.out.println(ticketBookings1.getBookingId()+ " " + ticketBookings1.getNoOfSeats()+ " " + ticketBookings1.getSource()
  + " " + ticketBookings1.getDestination()+ " " + ticketBookings1.getDate()+ " " + ticketBookings1.getPnr()+ " " + 
  ticketBookings1.getPrice()+ " " + ticketBookings1.getClassType()+ " " + ticketBookings1.getBookingType()+ " " + ticketBookings1.getTransportName());

  TicketBookings ticketBookings2 = new TicketBookings();
 ticketBookings2.setBookingId(3);
 ticketBookings2.setNoOfSeats(15);
 ticketBookings2.setSource("Mandya");
 ticketBookings2.setDestination("Shivmogga");
 ticketBookings2.setDate("5-8-2022");
 ticketBookings2.setPnr(9625465765L);
 ticketBookings2.setPrice(3900.00);
 ticketBookings2.setClassType("Second");
 ticketBookings2.setBookingType("AC Chair");
 ticketBookings2.setTransportName("Shatabdi Express");
 
 System.out.println(ticketBookings2.getBookingId()+ " " + ticketBookings2.getNoOfSeats()+ " " + ticketBookings2.getSource()
  + " " + ticketBookings2.getDestination()+ " " + ticketBookings2.getDate()+ " " + ticketBookings2.getPnr()+ " " + 
  ticketBookings2.getPrice()+ " " + ticketBookings2.getClassType()+ " " + ticketBookings2.getBookingType()+ " " + ticketBookings2.getTransportName());

  TicketBookings ticketBookings3 = new TicketBookings();
 ticketBookings3.setBookingId(4);
 ticketBookings3.setNoOfSeats(35);
 ticketBookings3.setSource("Belagavi");
 ticketBookings3.setDestination("Mysore");
 ticketBookings3.setDate("8-7-2021");
 ticketBookings3.setPnr(8624365865L);
 ticketBookings3.setPrice(1000.00);
 ticketBookings3.setClassType("Third");
 ticketBookings3.setBookingType("Senior Citizen");
 ticketBookings3.setTransportName("Maharaja Express");
 
 System.out.println(ticketBookings3.getBookingId()+ " " + ticketBookings3.getNoOfSeats()+ " " + ticketBookings3.getSource()
  + " " + ticketBookings3.getDestination()+ " " + ticketBookings3.getDate()+ " " + ticketBookings3.getPnr()+ " " + 
  ticketBookings3.getPrice()+ " " + ticketBookings3.getClassType()+ " " + ticketBookings3.getBookingType()+ " " + ticketBookings3.getTransportName());

  TicketBookings ticketBookings4 = new TicketBookings();
 ticketBookings4.setBookingId(5);
 ticketBookings4.setNoOfSeats(27);
 ticketBookings4.setSource("Mysore");
 ticketBookings4.setDestination("Bhagalkote");
 ticketBookings4.setDate("9-5-2025");
 ticketBookings4.setPnr(9732465865L);
 ticketBookings4.setPrice(4500.00);
 ticketBookings4.setClassType("Sleeper");
 ticketBookings4.setBookingType("General");
 ticketBookings4.setTransportName("Kranti Express");
 
 System.out.println(ticketBookings4.getBookingId()+ " " + ticketBookings4.getNoOfSeats()+ " " + ticketBookings4.getSource()
  + " " + ticketBookings4.getDestination()+ " " + ticketBookings4.getDate()+ " " + ticketBookings4.getPnr()+ " " + 
  ticketBookings4.getPrice()+ " " + ticketBookings4.getClassType()+ " " + ticketBookings4.getBookingType()+ " " + ticketBookings4.getTransportName());

}
}