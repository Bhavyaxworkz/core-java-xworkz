class Television1{
	
static String name ="Sony";
 static  int minVolume; 
 static int currentVolume;
 static  int maxVolume = 20;
  static boolean isConnected; 
  
 
                           //method
      public static boolean onOrOff(){
	
		System.out.println("Invoking onOrOff");
		System.out.println("parameter" +0);
		if(isConnected == false){
		    isConnected = true;
			System.out.println("Television is Turned onn.Enjoy");
		
		
		}
		else if(isConnected == true){
		 isConnected = false;
		 System.out.println("Television is Turned off...");
		
		}
		
	  return isConnected;
	  
	  }
    // increaseVolume and decrease volume are methods
	public static void increaseVolume(){
		System.out.println("Start of increaseVolume()");
		if(isConnected == true){
		if(currentVolume < maxVolume){
			currentVolume =currentVolume + 1;
			System.out.println("The Current Volume is" +currentVolume);
			}
			else{
				System.out.println("max Volume reached");
			}
		}else{
				System.out.println("Gube...Television connect madu firstu");
			}
			System.out.println("End of increaseVolume()");
		}
	// decreaseVolume
	public static void decreaseVolume(){
		System.out.println("Invoking decreaseVolume()");
		System.out.println("list of parameters" +0);
		if(isConnected == true){
		if(currentVolume > minVolume){
			currentVolume = currentVolume - 1;
			System.out.println("The Current Volume is" +currentVolume);
		}
		else{
				System.out.println("min Volume reached");
				
			}
		}else{
				System.out.println("Television is turned off...can't decrease the volume");
			}
			System.out.println("End of decreaseVolume()");
		}
		
	
}