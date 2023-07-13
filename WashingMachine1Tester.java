 class WashingMachine1Tester{
public static void main(String test[]){
System.out.println("Main Started");

boolean connected = WashingMachine1.onOrOff();
System.out.println("Is WashingMachine1 connected" + connected);
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
System.out.println("Max limit reached");
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
System.out.println(" ");
boolean connected1 = WashingMachine1.onOrOff(); //className.methodName();
System.out.println("Is Washing Machine connected" +connected1);
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.increaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();
WashingMachine1.decreaseSpeed();

System.out.println("Main Ended");
}
}