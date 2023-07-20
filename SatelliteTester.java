class SatelliteTester{
   
   public static void main(String satellite[]){
   
	  Satellite satellite1 = new Satellite("Sputnik 1","communication",2000);
	  
	  System.out.println(satellite1.name + " " + satellite1.type + " " + satellite1.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite2 = new Satellite("Cartosat-2A","earth observation",60000);
	  
	  System.out.println(satellite2.name + " " + satellite2.type + " " + satellite2.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite3 = new Satellite("Cartosat-2B","navigation",45000);
	  
	  System.out.println(satellite3.name + " " + satellite3.type + " " + satellite3.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite4 = new Satellite("IRNSS-1D","astronomical",85000);
	  
	  System.out.println(satellite4.name + " " + satellite4.type + " " + satellite4.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite5 = new Satellite("Megha-Tropiques","communication",100000);
	  
	  System.out.println(satellite5.name + " " + satellite5.type + " " + satellite5.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite6 = new Satellite("SARAL","earth observation",28000);
	 
	  System.out.println(satellite6.name + " " + satellite6.type + " " + satellite6.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite7 = new Satellite("RISAT-1","astronomical",150000);
	 
	  System.out.println(satellite7.name + " " + satellite7.type + " " + satellite7.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite8 = new Satellite("GSAT-3","navigation",55000);
	  
	  System.out.println(satellite8.name + " " + satellite8.type + " " + satellite8.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite9 = new Satellite("chandrayaan-1","astronomical",195000);
	  
	  System.out.println(satellite9.name + " " + satellite9.type + " " + satellite9.communicationCost);
	  System.out.println(" ");
	  
	  Satellite satellite10 = new Satellite("Kalpana-1","communication",156000);
	 
	  System.out.println(satellite10.name + " " + satellite10.type + " " + satellite10.communicationCost);
	  System.out.println(" ");
}
}
