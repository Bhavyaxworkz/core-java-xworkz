class Mixer{
	
static String name ="Butterfly";
 static  int minSpeed; 
 static int currentSpeed;
 static  int maxSpeed = 30;
  static boolean isConnected; 
 
                           //method
      public static boolean onOrOff(){
	 
		System.out.println("Invoking onOrOff");
		System.out.println("parameter" +0);
		if(isConnected == false){
		    isConnected = true;
			System.out.println("Mixer is Turned onn.Enjoy");
		
		
		}
		else if(isConnected == true){
		 isConnected = false;
		 System.out.println("Mixer is Turned off...");
		
		}
		
	  return isConnected;
	  
	  }
   
	public static void increaseSpeed(){
		System.out.println("Start of increaseSpeed()");
		if(isConnected == true){
		if(currentSpeed < maxSpeed){
			currentSpeed =currentSpeed + 1;
			System.out.println("The Current Speed is" +currentSpeed);
			}
			else{
				System.out.println("max Speed reached");
			}
		}else{
				System.out.println("Gube.. Mixer on  madu firstu");
			}
			System.out.println("End of increaseSpeed()");
		}
	// decreaseSpeed
	public static void decreaseSpeed(){
		System.out.println("Invoking decreaseSpeed()");
		System.out.println("list of parameters" +0);
		if(isConnected == true){
		if(currentSpeed> minSpeed){
			currentSpeed = currentSpeed - 1;
			System.out.println("The Current Speed is" +currentSpeed);
		}
		else{
				System.out.println("min Speed reached");
				
			}
		}else{
				System.out.println("Mixer is turned off...can't decrease the Speed");
			}
			System.out.println("End of decreaseSpeed()");
		}
		
	
}