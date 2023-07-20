class Books{
	public Books(){
		System.out.println("Invoking default Books constructor");
	}
		
 
 String name;
 String type;
 String author;
 int price;

 
 public  Books(String name,String type,String author,int price){
	 this.name = name;
	 this.type = type;
	 this.author = author;
	 this.price = price;
	 
	 System.out.println("Books constructor is invoked");
 System.out.println("Books are used to read");
 }



}