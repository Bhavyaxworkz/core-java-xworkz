class AC1Tester{
public static void main(String test[]){
System.out.println("Main Started");

boolean connected = AC1.onOrOff(); 
System.out.println("Is AC1 connected" + connected);
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
System.out.println("Max limit reached");
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
System.out.println(" ");
boolean connected1 = AC1.onOrOff(); //className.methodName();
System.out.println("Is AC1 connected" +connected1);
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.increaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();
AC1.decreaseTemp();

System.out.println("Main Ended");
}
}