class Speaker1Tester{
public static void main(String test[]){
System.out.println("Main Started");
// the method is returning boolean type of value so[returntype variable = calss name.methodname();]
boolean connected = Speaker1.onOrOff(); //.operator is used to invoke from one method to another
System.out.println("Is Speaker connected" + connected);
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
System.out.println("Max limit reached");
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
System.out.println(" ");
boolean connected1 = Speaker1.onOrOff(); //className.methodName();
System.out.println("Is Speaker connected" +connected1);
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.increaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();
Speaker1.decreaseVolume();

System.out.println("Main Ended");
}
}