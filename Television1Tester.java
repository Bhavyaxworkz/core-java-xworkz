class Television1Tester{
public static void main(String test[]){
System.out.println("Main Started");

boolean connected = Television1.onOrOff(); 
System.out.println("Is Television connected" + connected);
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
System.out.println("Max limit reached");
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
System.out.println(" ");
boolean connected1 = Television1.onOrOff(); 
System.out.println("Is Television connected" +connected1);
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.increaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();
Television1.decreaseVolume();

System.out.println("Main Ended");
}
}