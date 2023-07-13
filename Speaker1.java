class Speaker1{
	
static String name ="JBI";
 static  int minVolume; //default value of int is 0
 static int currentVolume;
 static  int maxVolume = 10;
  static boolean isConnected; //default value is false
 
                           //method
      public static boolean onOrOff(){
	 //false == false, false is turned into true then the speaker is onn
	 //true = false, condition  is not satisfied
		System.out.println("Invoking onOrOff");
		System.out.println("parameter" +0);
		if(isConnected == false){
		    isConnected = true;
			System.out.println("Speaker is Turned onn.Enjoy");
		
		
		}
		else if(isConnected == true){
		 isConnected = false;
		 System.out.println("Speaker is Turned off...");
		
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
				System.out.println("Gube...Speaker connect madu firstu");
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
				System.out.println("Speaker is turned off...can't decrease the volume");
			}
			System.out.println("End of decreaseVolume()");
		}
		
	
}