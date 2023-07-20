class AgroIndustry{
	public AgroIndustry(){
		System.out.println("Invoking default AgroIndustry constructor");
	}

  String name;
  String type;
  int quantityProducedInKg;
  
  public AgroIndustry(String name,String type,int quantityProducedInKg){
	  this.name = name;
	  this.type = type;
	  this.quantityProducedInKg=quantityProducedInKg;
	  System.out.println("AgroIndustry constructor is invoked");
  System.out.println("Agro industries have agricultural produce as raw material");
  }
}