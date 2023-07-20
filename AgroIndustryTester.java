class AgroIndustryTester{

public static void main(String agroIndustry[]){
   
	  System.out.println("Creating 1st copy of agroIndustry");
	  AgroIndustry agroIndustry1 = new AgroIndustry("Nisarga Farms", "Textile Industry",400);
	  System.out.println(agroIndustry1.name + " " + agroIndustry1.type + " " + agroIndustry1.quantityProducedInKg);
	  
	  System.out.println("Creating 2nd copy of agroIndustry");
	  AgroIndustry agroIndustry2 = new AgroIndustry("Farmed Goods","Sugar Industry",330);
	  
	  System.out.println(agroIndustry2.name + " " + agroIndustry2.type + " " + agroIndustry2.quantityProducedInKg);
	  
	  System.out.println("Creating 3rd copy of agroIndustry");
	  AgroIndustry agroIndustry3 = new AgroIndustry("Pastures Place","Vegetable Oil Industry",210);
	  
	  System.out.println(agroIndustry3.name + " " + agroIndustry3.type + " " + agroIndustry3.quantityProducedInKg);
	  
	  System.out.println("Creating 4th copy of agroIndustry");
	  AgroIndustry agroIndustry4 = new AgroIndustry("The Friendly Farm","Tea Industry",215);
	  
	  System.out.println(agroIndustry4.name + " " + agroIndustry4.type + " " + agroIndustry4.quantityProducedInKg);
	  
	  System.out.println("Creating 5th copy of agroIndustry");
	  AgroIndustry agroIndustry5 = new AgroIndustry("Natural Farms","Coffee Industry",350);
	  System.out.println(agroIndustry5.name + " " + agroIndustry5.type + " " + agroIndustry5.quantityProducedInKg);
	  
	  System.out.println("Creating 6th copy of agroIndustry");
	  AgroIndustry agroIndustry6 = new AgroIndustry("Fortune Farms","Leather Goods Industry",270);
	  
	  System.out.println(agroIndustry6.name + " " + agroIndustry6.type + " " + agroIndustry6.quantityProducedInKg);
	  
	  System.out.println("Creating 7th copy of agroIndustry");
	  AgroIndustry agroIndustry7 = new AgroIndustry("Joy Farms","Textile Industry",200);
	  
	  System.out.println(agroIndustry7.name + " " + agroIndustry7.type + " " + agroIndustry7.quantityProducedInKg);
	  
	  System.out.println("Creating 8th copy of agroIndustry");
	  AgroIndustry agroIndustry8 = new AgroIndustry("Peak Pastures","Sugar Industry",155);
	  
	  System.out.println(agroIndustry8.name + " " + agroIndustry8.type + " " + agroIndustry8.quantityProducedInKg);
	  
	  System.out.println("Creating 9th copy of agroIndustry");
	  AgroIndustry agroIndustry9 = new AgroIndustry("Glow Farms","Vegetable Oil Industry",500);
	  System.out.println(agroIndustry9.name + " " + agroIndustry9.type + " " + agroIndustry9.quantityProducedInKg);
	  
	  System.out.println("Creating 10th copy of agroIndustry");
	  AgroIndustry agroIndustry10 = new AgroIndustry("Naamdaari Farms","Coffee Industry",305);
	  
	  System.out.println(agroIndustry10.name + " " + agroIndustry10.type + " " + agroIndustry10.quantityProducedInKg);
}

}