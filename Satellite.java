class Satellite{
	public Satellite(){
		System.out.println("Invoking default Satellite constructor");
	}

  String name;
  String type;
  int communicationCost;
  
  public  Satellite(String name,String type,int communicationCost){
	  this.name=name;
	  this.type=type;
	  this.communicationCost=communicationCost;
	  System.out.println("Satellite constructor is invoked");
  System.out.println("Satellitesa re launched for research purpose");
  }

}