class SoapObject{
	public SoapObject(){
		System.out.println("Invoking default SoapObject constructor");
	}
 
   String name;
   String type;
   String color;
   double price;

   public SoapObject(String name,String type,String color,double price){
	   this.name= name;
	   this.type = type;
	   this.color = color;
	   this.price = price;
	   System.out.println("SoapObject constructor is invoked");
   System.out.println("To use");
   
   }


}