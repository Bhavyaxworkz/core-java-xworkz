class Oven{
	
static String name ="Bajaj";
 static  int minTemp; 
 static int currentTemp;
 static  int maxTemp = 30;
  static boolean isConnected; 
 
                           
      public static boolean onOrOff(){
	 
		System.out.println("Invoking onOrOff");
		System.out.println("parameter" +0);
		if(isConnected == false){
		    isConnected = true;
			System.out.println("Oven is Turned onn.Enjoy");
		
		
		}
		else if(isConnected == true){
		 isConnected = false;
		 System.out.println("Oven is Turned off...");
		
		}
		
	  return isConnected;
	  
	  }
   
	public static void increaseTemp(){
		System.out.println("Start of increaseTemp()");
		if(isConnected == true){
		if(currentTemp < maxTemp){
			currentTemp =currentTemp + 1;
			System.out.println("The Current Temp is" +currentTemp);
			}
			else{
				System.out.println("max Temp reached");
			}
		}else{
				System.out.println("Gube...Oven on  madu firstu");
			}
			System.out.println("End of increaseTemp()");
		}

	public static void decreaseTemp(){
		System.out.println("Invoking decreaseTemp()");
		System.out.println("list of parameters" +0);
		if(isConnected == true){
		if(currentTemp > minTemp){
			currentTemp = currentTemp - 1;
			System.out.println("The Current Temp is" +currentTemp);
		}
		else{
				System.out.println("min Temp reached");
				
			}
		}else{
				System.out.println("Oven is turned off...can't decrease the Temp");
			}
			System.out.println("End of decreaseTemp()");
		}
		
	
}