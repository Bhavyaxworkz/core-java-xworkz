class Chair{
	public Chair(){
		System.out.println("Invoking defaule Chair constructor");
	}
//states
//istance variables
String name;
String color;
String type;
double price;

//behaviour
//instance methods
public  Chair(String name,String color,String type,double price){
	this.name=name;
	this.color=color;
	this.type=type;
	this.price = price;
	System.out.println("Chair constructor is invoked");
  System.out.println("to sit");
  
  
}
}
