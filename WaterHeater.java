class WaterHeater{
	public  WaterHeater(){
		System.out.println("Invoking default WaterHeater constructor");
	}

 String name;
 String capacity;
 int price;
 String color;

 public  WaterHeater(String name,String capacity,int price,String color){
	 this.name=name;
	 this.capacity=capacity;
	 this.price=price;
	 this.color=color;
	 System.out.println("WaterHeater constructor is invoked");
	 System.out.println("WaterHeater is used to heat water");
 }
}