class MusicalInstruments{
	public MusicalInstruments(){
		System.out.println("Invoking default MusicalInstruments constructor");
	}
 
 String name;
 String type;
 String color;
 int price;

 public MusicalInstruments(String name,String type,String color,int price){
	 this.name = name;
	 this.type = type;
	 this.color = color;
	 this.price = price;
	 System.out.println("MusicalInstruments constructor is invoked");
 System.out.println("MusicalInstruments produce music");
 
 }


}