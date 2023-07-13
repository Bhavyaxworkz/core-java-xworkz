class WashingMachine1{
	
static String name ="Hier";
static  int minSpeed; 
static int currentSpeed;
static  int maxSpeed = 40;
  static boolean isConnected; 
 
                         
public static boolean onOrOff(){
	 System.out.println("Invoking onOrOff");
		System.out.println("parameter" +0);
		if(isConnected == false){
		    isConnected = true;
			System.out.println("WashingMachine is Turned onn.Enjoy");
		
		
		}
		else if(isConnected == true){
		 isConnected = false;
		 System.out.println("WashingMachine is Turned off...");
		
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
				System.out.println("Gube.. WashingMachine on  madu firstu");
			}
			System.out.println("End of increaseSpeed()");
		}
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
				System.out.println("WashingMachine is turned off...can't decrease the Speed");
			}
			System.out.println("End of decreaseSpeed()");
		}
		
	
}