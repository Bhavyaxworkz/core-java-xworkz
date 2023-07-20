class Pen{
public Pen(){
		System.out.println("Invoking default Pen constructor");
	}
 //instance
 String brandName;
 String color;
 String type;
 int price;
 
 //instance method
 public Pen(String brandName,String color,String type,int price){
	  this.brandName = brandName;
	  this.color = color;
	  this.type = type;
	  this.price = price;
	 System.out.println("Pen constructor is invoked");
 System.out.println("To write");
 
 }



}