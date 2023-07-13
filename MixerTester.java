class MixerTester{
public static void main(String test[]){
System.out.println("Main Started");

boolean connected = Mixer.onOrOff(); 
System.out.println("Is Mixer connected" + connected);
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
System.out.println("Max limit reached");
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
System.out.println(" ");
boolean connected1 = Mixer.onOrOff(); 
System.out.println("Is Mixer connected" +connected1);
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.increaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();
Mixer.decreaseSpeed();

System.out.println("Main Ended");
}
}