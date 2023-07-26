class TicketBookings{
//bookingId,noOfSeats,source,destination,date,Timings
//pnr,price,class,bookingType,transportName,
private int bookingId;
private int noOfSeats;
private  String source;
private String destination;
private String date;
private long pnr;
private double price;
private String classType;
private String bookingType;
private String transportName;


 public void setBookingId(int bookingId){
     this.bookingId = bookingId;
}
     public int getBookingId(){
       return bookingId;
}
  public void setNoOfSeats(int noOfSeats){
	  this.noOfSeats = noOfSeats;
  }
public int getNoOfSeats(){
	return noOfSeats;
}
public void setSource(String source){
	  this.source = source;
  }
public String getSource(){
	return source;
}
public void setDestination(String destination){
	  this.destination = destination;
  }
public String getDestination(){
	return destination;
}
public void setDate(String date){
	  this.date = date;
  }
public String getDate(){
	return date;
}
public void setPnr(long pnr){
	  this.pnr = pnr;
  }
public long getPnr(){
	return pnr;
}
public void setPrice(double price){
	  this.price = price;
  }
public double getPrice(){
	return price;
}
public void setClassType(String classType){
	  this.classType = classType;
  }
public String getClassType(){
	return classType;
}
public void setBookingType(String bookingType){
	  this.bookingType = bookingType;
  }
public String getBookingType(){
	return bookingType;
}
public void setTransportName(String transportName){
	  this.transportName = transportName;
  }
public String getTransportName(){
	return transportName;
}














}

