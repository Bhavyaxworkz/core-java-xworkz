class TubeLight{
	
  
   String name;
   String type;
   String powerConsumption;
   int price;
   
   public TubeLight(String name,String type,String powerConsumption,int price){
	   this.name=name;
	   this.type=type;
	   this.powerConsumption=powerConsumption;
	   this.price=price;
	   System.out.println("TubeLight constructor is invoked");
   System.out.println("Light helps us to see");
   }

}