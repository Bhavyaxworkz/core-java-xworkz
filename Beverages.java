class Beverages{
	public  Beverages(){
		System.out.println("Invoking default Beverages constructor");
	}
 
 String name;
 String flavour;
 String type;
 String color;
 
 public  Beverages(String name,String flavour,String type,String color){
	 this.name = name;
	 this.flavour=flavour;
	 this.type=type;
	 this.color=color;
	 System.out.println(" Beverages constructor is invoked");
	 System.out.println("Beverages to drink");
 }
 
}