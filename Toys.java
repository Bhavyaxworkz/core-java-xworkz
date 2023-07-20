class Toys{
	public Toys(){
		System.out.println("Invoking default Toys constructor");
	}
  
  String name;
  String type;
  String color;
  int price;
  
  public  Toys(String name,String type,int price,String color){
	  this.name=name;
	  this.type=type;
	  this.color=color;
	  this.price=price;
	  System.out.println("Toys constructor is invoked");
  System.out.println("Toys are used to play");
  }




}