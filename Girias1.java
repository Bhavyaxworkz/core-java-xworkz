class Girias1{
    
   public static void main(String arg[]){
     System.out.println("main started");
	 String electronicDevices[] = {"refrigerator","Washing Machine","Television","LED","Grinder","AC","IronBox","Microwave"};
  	 double priceOfElectronicDevices[] = {50000.00,40000.0,75000.50,15000.89,8000.60,45000.70,0.0,6000.45};
	 System.out.println(electronicDevices[0]+ " " + electronicDevices[1]);
	 System.out.println("List of electronic Devices are:");
	                       //0<8
 	 //for
	 for(int Index=0; Index < electronicDevices.length; Index++  ){
	 System.out.println(electronicDevices[Index]);
	 Index++;
	 
	 
	 
	 }                                                              //can to give a program about array to fetch back data
	 System.out.println("List of electronic Devices are:");
	 for( String electronicDevice :electronicDevices ){
		 System.out.println(electronicDevice );
		 
		 
		 
	 }
	 for(double priceOfelectronicDevice : priceOfelectronicDevices){
		 System.out.println(priceOfelectronicDevice);
		 
	 }
	 
	 System.out.println("main ended");
   
   
   
   
   
   }







}