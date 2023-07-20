class ProjectorObject{
	

	

 String name;
 String type;
 double maxDistance;
 int price;
 
 public ProjectorObject(String name, String type,double maxDistance,int price){
	 this.name=name;
	 this.type=type;
	 this.maxDistance=maxDistance;
	 this.price=price;
	 System.out.println("ProjectorObject constructor is invoked");
 System.out.println("Projector is to project Image");
 }
}